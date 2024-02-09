package AdvanceJava.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class DiningPhilosopher {

    static int philosopher = 8;
    static int chances = 20;
    static philosopher[] philosophers = new philosopher[philosopher];
    static chopstick[] chopsticks = new chopstick[philosopher];

    static class chopstick {

        public Semaphore mutex = new Semaphore(1);

        void grab() {
            try {
                mutex.acquire();
            }
            catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }

        void release() {
            mutex.release();
        }

        boolean isFree() {
            return mutex.availablePermits() > 0;
        }

    }

    static class philosopher extends Thread {

        public int number;
        public chopstick leftchopstick;
        public chopstick rightchopstick;

        philosopher(int num, chopstick left, chopstick right) {
            number = num;
            leftchopstick = left;
            rightchopstick = right;
        }

        public void run(){

            while (true) {
                leftchopstick.grab();
//                System.out.println("philosopher " + (number+1) + " grabs left chopstick.");
                rightchopstick.grab();
//                System.out.println("philosopher " + (number+1) + " grabs right chopstick.");
                eat();
                leftchopstick.release();
//                System.out.println("philosopher " + (number+1) + " releases left chopstick.");
                rightchopstick.release();
//                System.out.println("philosopher " + (number+1) + " releases right chopstick.");
            }
        }

        void eat() {
            try {
                int sleepTime = ThreadLocalRandom.current().nextInt(1000, 3000);
                System.out.println("philosopher " + (number+1) + " eats for " + ((double)sleepTime/1000)+" sec");
                chances -=1;
                if(chances<=0){
                    System.exit(0);
                }
                Thread.sleep(sleepTime);
            }
            catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }

    }

    public static void main(String[] argv) {

        int no_of_philosophers =8;
        for (int i = 0; i < no_of_philosophers; i++){
            chopsticks[i] = new chopstick();
        }
        ExecutorService executor = Executors.newFixedThreadPool(no_of_philosophers);
        for (int i = 0; i < no_of_philosophers; i++){
            if( i % 2 == 0)
                philosophers[i] = new philosopher(i, chopsticks[(i
                        + 1) % no_of_philosophers], chopsticks[i] );
            else
                philosophers[i] = new philosopher(i,
                        chopsticks[i], chopsticks[(i + 1) %
                        no_of_philosophers] );

            executor.execute(philosophers[i]);
//            philosophers[i].start();
        }
    }

}
