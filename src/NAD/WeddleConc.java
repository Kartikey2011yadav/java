package NAD;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class WeddleConc {

    public static Expression equation;
    static String var;
    Double a,b,Integral;
    int n,cores;
    Duration D;

    public WeddleConc(String e,String v,int core, double end, double start, int num) throws IOException {
        ExpressionBuilder eba = new ExpressionBuilder(e);
        var = v;
        eba.variables(v) ;
        equation = eba.build();
        a = start;
        b = end;
        n = num;
        Integral = 0.0;
        cores = core;
    }

    public Double getIntegral() {
        return Integral;
    }

    public Duration getD() {
        return D;
    }
    //    public static void ExpInput() {
//        System.out.print("Enter Equation: ");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        ExpressionBuilder eb = new ExpressionBuilder(s);
//        System.out.print("Enter Token Variable: ");
//        var = sc.next();
//        eb.variables(var);
//        equation = eb.build();
//        System.out.print("Enter Lower Range: ");
//        a = sc.nextDouble();
//        System.out.print("Enter Upper Range: ");
//        b = sc.nextDouble();
//        System.out.print("Enter Accuracy Rate (n): ");
//        n = sc.nextInt();
//    }

    public static synchronized double eval(double x){
        equation.setVariable(var,x);
        return equation.evaluate();
    }
    public void clear(){
        System.gc();
    }

    public boolean cal() throws ExecutionException, InterruptedException {

        Instant now = Instant.now();
        double subRangeSize = (b-a)/ cores;

        ExecutorService threadPool = Executors.newFixedThreadPool(cores);

        List<Future<Double>> futures = new ArrayList<Future<Double>>();

        for (int i = 0; i < cores; i++) {
            double subLowerBound = a + i * subRangeSize;
            double subUpperBound = subLowerBound + subRangeSize;

            Future<Double> future = threadPool.submit(new wedd(i,subLowerBound,subUpperBound,(double)n/cores));
            futures.add(future);
        }
        for(int i=0;i<cores;i++) {
            Integral += futures.get(i).get();
        }
//        System.out.println("Answer: "+Integral);

         D = Duration.between(now, Instant.now());
//        System.out.println("Time Taken multi-core:  "+d);
        return true;
    }

}

class wedd implements Callable<Double>{
    Double h,Start,Intervals,End;
    Integer workerId;
    Double[] x = new Double[7];
    Double[] y = new Double[7];
    public wedd(int i,double start ,double end, double n) {
        this.workerId = i;
        this.Start = start;
        this.End = end;
        this.Intervals = n;
        h = (End - Start)/ (Intervals * 6);
        for (int j = 0; j <7 ; j++) {
            this.x[j] = Start + h*j;
            this.y[j] = 0.0;
        }
    }

    @Override
    public Double call() throws Exception {
        Double t = 0.0;
        for (int i = 0; i <Intervals ; i++) {
           t += WeddleConc.eval(x[0]);
           t += 5* WeddleConc.eval(x[1]);
           t += WeddleConc.eval(x[2]);
           t += 6* WeddleConc.eval(x[3]);
           t += WeddleConc.eval(x[4]);
           t += 5* WeddleConc.eval(x[5]);
           t += WeddleConc.eval(x[6]);

           x[0] = x[6];
            for (int j = 0; j <6 ; j++) {
                x[j+1] = x[j] + h;
            }
        }

        return 0.3 * h * t;
    }
}

