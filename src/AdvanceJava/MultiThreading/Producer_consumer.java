package AdvanceJava.MultiThreading;

import java.util.LinkedList;
import java.util.Scanner;

public class Producer_consumer {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of product you want to produce: ");
        int products = sc.nextInt();
        final PC pc = new PC(products);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        t1.start();
        t2.start();


        t1.join();
        t2.join();
    }

    public static class PC {

        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
        int productCount;

        public PC(int productCount) {
            this.productCount = productCount;
        }

        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {

                    if (productCount == 0) {
                        System.out.println("All products are accounted for....");
                        return;
                    }

                    while (list.size() == capacity)
                        wait();

                    System.out.println("Producer produced-"
                            + value);

                    list.add(value++);
                    productCount--;

                    notify();

                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {

                    while (list.isEmpty())
                        wait();

                    int val = list.removeFirst();

                    System.out.println("Consumer consumed-"
                            + val);

                    notify();

                    Thread.sleep(1000);
                }
            }
        }
    }
}
