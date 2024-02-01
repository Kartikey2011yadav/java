package Experiment;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Multicore Processor Example in Java to use all available processor cores
 * to average lists of random numbers.
 * Uses the Java 8's Executor service for a Work Stealing Pool to divy the
 * work onto the available processor cores.
 * Example was run on a 8 Core 2.6 GHz Intel i7 with 16GB of 2133 LPDDR3
 * which takes around 14 seconds;
 */
public class MultiCoreExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        int cores = Runtime.getRuntime().availableProcessors();
        int numWorkers = 100;
        System.out.println("Available processor cores is "+cores);

        Instant now = Instant.now(); // Start clock at now

        // Work Stealing Pool is new in Java 8
        //ExecutorService threadPool = Executors.newSingleThreadExecutor();
        ExecutorService threadPool = Executors.newWorkStealingPool();
        //ExecutorService threadPool = Executors.newFixedThreadPool(1);

        // Each future will have the average of the list of random doubles
        List<Future<Double>> futures = new LinkedList<Future<Double>>();

        // Populate the list of futures by submitting callables to the thread pool
        for(int i=0;i<numWorkers;i++) {
            futures.add(i,threadPool.submit(new Worker(i))); // non-blocking
        }

        Double avg = 0.0;
        for(int i=0;i<numWorkers;i++) {
            // Future::get() is a blocking call until the task is done
            // while we block (wait) on one task to finish the others are still working
            avg += futures.get(i).get();
        }
        System.out.println("Average is: "+avg/numWorkers);

        Duration d = Duration.between(now, Instant.now());
        System.out.println("Time Taken multi-core:  "+d); // Total time taken

//        now = Instant.now();
//        avg = 0.0;
//        for(int i=0;i<numWorkers;i++) {
//            Experiment.Worker worker = new Experiment.Worker(i);
//            try {
//                avg += worker.call();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
////        System.out.println("Average is: "+avg/numWorkers);
//        d = Duration.between(now, Instant.now());
//        System.out.println("Time Taken single core: "+d); // Total time taken
    }
}

/**
 *  Class represents a worker that is put onto an available processor
 *  to get an average of a list of doubles. In the example this represents
 *  the work that would be done concurrently.
 */
class Worker implements Callable<Double> {
    Integer workerId;

    /**
     * Size of the list of random numbers.
     * Need to find a "sweet spot" for the memory
     * your machine has for this to take a decent
     * amount of time and to be able to use memory
     * without hitting the disk.
     */
    Integer workSize = 1000000;
    List<Double> workList;

//    public double func(double n){
//        ExpressionBuilder eb = new ExpressionBuilder("1/(x^2+1)");
//        eb.variables("x");
//        Expression e = eb.build();
//        e.setVariable("x",n);
//        return e.evaluate();
//    }
    Worker(Integer id) {
        this.workerId = id;
        workList = new ArrayList<>();

        // Populate the array with random numbers
        for(int i = 0; i<workSize; i++) {
            workList.add(i,  Math.random());
        }
    }

    /**
     * The function that does the work. If you didn't want to
     * average random numbers, which I'm sure is the case
     * replace this with something meaningful.
     */
    @Override
    public Double call() throws Exception {
        Instant now = Instant.now();
        Double avg = 0.0;

        // A bit of a complex functional call that uses mutible reduction to get the average
        WorkerTask collect = workList.parallelStream().collect(WorkerTask::new, WorkerTask::accept, WorkerTask::combine);

        // Compute the average
        avg = collect.average();

        Duration d = Duration.between(now, Instant.now());
        //System.out.println(String.format("Experiment.Worker %d done with average %f on %d numbers in %s seconds",workerId,avg,collect.count,d.toString()));
        return (double)avg;
    }
}



/**
 * Arguably more complex than it needs to be but this class
 * allows us to use mutible reduction to get the average of
 * all the numbers. It is essentially a class that stores a
 * total of all the numbers and a count of them since
 * total/count is the average. With one distinction is that
 * it has a combine method that will allow the
 * classes to be combined together for the mutible reduction.
 * The combine won't be called unless the collection of the
 * stream is done in parallel, which it isn't in this example.
 * See the line of workList.stream would need to be replaced
 * by workList.parallelStream.
 */
class WorkerTask {
    Double total = 0.0; // sum of every number given to the task
    Integer count = 0; // count of every number given

    // Simple average function
    public Double average() {
        return count > 0 ? total / (int) count : 0;
    }

    // Adds a number from the list
    public void accept(Double i) {
        total += i;
        count ++;
    }

    // Will combine with another of itself
    public void combine(WorkerTask other) {
//        System.out.println("Combine Called");
        total += other.total;
        count += other.count;
    }
}
