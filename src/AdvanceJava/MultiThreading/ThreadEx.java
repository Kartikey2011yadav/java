package AdvanceJava.MultiThreading;

class ThreadX implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread X with i = " + -1 * i);
        }
        System.out.println("Exiting Thread X ...");
    }
}

class ThreadY implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Thread Y with j = " + 2 * j);
        }
        System.out.println("Exiting Thread Y ...");
    }
}

class ThreadZ implements Runnable {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("Thread Z with k = " + (2 * k - 1));
        }
        System.out.println("Exiting Thread Z ...");
    }
}

public class ThreadEx {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadX());

        Thread t2 = new Thread(new ThreadY());

        Thread t3 = new Thread(new ThreadZ());

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("... Multithreading is over ");
    }
}

