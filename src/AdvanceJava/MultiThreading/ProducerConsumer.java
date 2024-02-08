package AdvanceJava.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class ProducerConsumer {
    static Semaphore bufferLock = new Semaphore(1);
    static List<Integer> buffer = new ArrayList<>();

    public static class producer implements Runnable{

        int products;

        public producer(int products) {
            this.products = products;
        }

        @Override
        public void run() {
            try{
                while (products>0){
                    bufferLock.acquire();
                    buffer.add((int) (Math.random()*100));
                    System.out.println(Thread.currentThread().getName()+" Produced product: "+buffer.getLast());
                    products-=1;
                    bufferLock.release();
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class consumer implements Runnable{
        @Override
        public void run(){
            try{
                while (!buffer.isEmpty()){
                    bufferLock.acquire();
                    System.out.println(Thread.currentThread().getName()+" Consumes product: "+buffer.getFirst());
                    buffer.removeFirst();
                    bufferLock.release();
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        producer product = new producer(10);
        Thread producer1 = new Thread(product);
        producer1.setName("Producer1");
        Thread producer2 = new Thread(product);
        producer2.setName("Producer2");
        consumer consumption = new consumer();
        Thread consumer1 = new Thread(consumption);
        consumer1.setName("Consumer1");
        Thread consumer2 = new Thread(consumption);
        consumer2.setName("Consumer2");
        producer1.start();
        consumer1.start();
        producer2.start();
        consumer2.start();
    }
}
