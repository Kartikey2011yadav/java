package NAD;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class WeddleTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processor cores is " + cores);

            int interval =18000000;
            for (int j = 6; j < 13; j++) {
                boolean res = false;
                WeddleConc w = new WeddleConc("1/(x^2+1)", "x", j, 1.0, 0.0, interval);
                try {
                    res = w.cal();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                if (res) {
                    System.out.print(j+"   ");
                    System.out.print(w.getIntegral()+"   ");
                    System.out.println(w.getD());
                    w.clear();
                }
            }
    }
}