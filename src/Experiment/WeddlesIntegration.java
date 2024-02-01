package Experiment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WeddlesIntegration {

    private final Function<Double, Double> expression;
    private final double a;
    private final double b;
    private final int n;

    public WeddlesIntegration(Function<Double, Double> expression, double a, double b, int n) {
        this.expression = expression;
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public double integrate() {
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        int chunkSize = n / numThreads;

        double[] chunkIntegrals = new double[numThreads];
        double sum = 0.0;
        try {
            for (int i = 0; i < numThreads; i++) {
                int start = i * (chunkSize);
                int end = (i == numThreads - 1) ? n-1 : (i + 1) * chunkSize ;
                executorService.submit(new ChunkIntegralCalculator(start, end, chunkIntegrals, i,chunkSize));
            }

            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        double h = (b - a) / n;
        for (int i = 0; i < numThreads; i++) {
            sum += chunkIntegrals[i];
        }
        return 0.3*h* sum;
    }

    private class ChunkIntegralCalculator implements Runnable {
        private final int start;
        private final int end;
        private final double[] chunkIntegrals;
        private final int chunkIndex;
        private final int chunkSize;
        double[] x;
        double integral ;

        public ChunkIntegralCalculator(int start, int end, double[] chunkIntegrals, int chunkIndex,int chunkSize) {
            this.start = start;
            this.end = end;
            this.chunkIntegrals = chunkIntegrals;
            this.chunkIndex = chunkIndex;
            this.chunkSize = chunkSize;
            this.integral = 0.0;
            this.x = new double[7];
        }

        @Override
        public void run() {
            double h = (b - a) / n;
            x[0] = a + start * h;
            for (int i = 1; i < 7; i++) {
                x[i] = x[i - 1] + h;
            }
            for (int i = start; i <= end; i++) {
                double f0 = expression.apply(x[0]);
                double f1 = expression.apply(x[1]);
                double f2 = expression.apply(x[2]);
                double f3 = expression.apply(x[3]);
                double f4 = expression.apply(x[4]);
                double f5 = expression.apply(x[5]);
                double f6 = expression.apply(x[6]);

                integral += ( f0 + 5 * f1 + f2 + 6 * f3 + f4 + 5 * f5 + f6);
                x[0] = x[6];
                for (int j = 1; j < 7; j++) {
                    x[j] = x[j - 1] + h;
                }
            }

            chunkIntegrals[chunkIndex] = integral;
        }
    }

    public static void main(String[] args) {
        WeddlesIntegration w = new WeddlesIntegration(x->1/(x*x +1),0,1,12000000);
        Double res = w.integrate();
        System.out.println(res);
    }

}


