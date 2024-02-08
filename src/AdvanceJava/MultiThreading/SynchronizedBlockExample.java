package AdvanceJava.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// sum of 500 random integers

class Counter {
    private int sum = 0;

    public void increment() {
        synchronized (this) {
            sum += (int) (Math.random()*100);
        }
    }

    public int getCount() {
        return sum;
    }
}

public class SynchronizedBlockExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Counter counter = new Counter();

        for(int i = 0; i < 500; i++) {
            executorService.submit(() -> counter.increment());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Finally sum of 500 random integers is " + counter.getCount());
    }
}
