package AdvanceJava.multithreading;

import java.util.Random;

public class Producer implements Runnable {
    private static final Random generator = new Random();
    private final Buffer sharedLocation; // reference to shared object

    // constructor
    public Producer(Buffer shared) {
        sharedLocation = shared;
    } // end Producer constructor

    // store values from 1 to 10 in sharedLocation
    public void run() {
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            try // sleep 0 to 3 seconds, then place value in Buffer
            {
                Thread.sleep(generator.nextInt(3000)); // sleep thread
                sharedLocation.set(count); // set value in buffer
                sum += count; // increment sum of values
                System.out.printf("\t%2d\n", sum);
            } // end try
            // if sleeping thread interrupted, print stack trace
            catch (InterruptedException exception) {
                exception.printStackTrace();
            } // end catch
        } // end for

        System.out.printf("\n%s\n%s\n", "Producer done producing.",
                "Terminating Producer.");
    } // end method run
} // end class Producer
