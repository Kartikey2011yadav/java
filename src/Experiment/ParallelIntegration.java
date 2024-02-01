package Experiment;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelIntegration {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // read expression from user
        Expression expression = new ExpressionBuilder("1/(x^2+1)").build();

        // define integration range
        double lowerBound = Double.parseDouble("0");
        double upperBound = Double.parseDouble("1 ");

        // define number of threads to use
        int numThreads = Runtime.getRuntime().availableProcessors();

        // define sub-range size
        double subRangeSize = (upperBound - lowerBound) / numThreads;

        // create thread pool
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // submit integration tasks to thread pool
        List<Future<Double>> futures = new ArrayList<>();
        for (int i = 0; i < numThreads; i++) {
            double subLowerBound = lowerBound + i * subRangeSize;
            double subUpperBound = subLowerBound + subRangeSize;

            Future<Double> future = executor.submit(new IntegrationTask(expression, subLowerBound, subUpperBound));
            futures.add(future);
        }

        // sum up results from all threads
        double integration = 0;
        for (Future<Double> future : futures) {
            integration += future.get();
        }

        // shut down thread pool
        executor.shutdown();

        System.out.println("Integration result: " + integration);
    }

    private static class IntegrationTask implements Callable<Double> {
        private final Expression expression;
        private final double lowerBound;
        private final double upperBound;

        public IntegrationTask(Expression expression, double lowerBound, double upperBound) {
            this.expression = expression;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        @Override
        public Double call() throws Exception {
            // calculate integration for this sub-range
            double integration = 0;
            double step = 0.01;
            for (double x = lowerBound; x < upperBound; x += step) {
                integration += expression.evaluate() * step;
            }

            return integration;
        }
    }
}
