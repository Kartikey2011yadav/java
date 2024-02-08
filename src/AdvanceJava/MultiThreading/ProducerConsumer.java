package AdvanceJava.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class ProducerConsumer {
    static Semaphore bufferLock = new Semaphore(1);
    static List<Integer> buffer = new ArrayList<>();
    static int productCount;

    public static class producer implements Runnable{

        int products;

        public producer(int products) {
            this.products = products;
            productCount += products;
        }

        @Override
        public void run() {
            try{
                while (products>0){
                    bufferLock.acquire();
                    buffer.add((int) (Math.random()*100));
                    int sleepTime = ThreadLocalRandom.current().nextInt(1000, 1500);
                    System.out.println(Thread.currentThread().getName()+" Produced product: "+buffer.getLast());
                    products-=1;

                    bufferLock.release();
                    Thread.sleep(sleepTime);
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
                while (true){
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    bufferLock.acquire();
                    int sleepTime = ThreadLocalRandom.current().nextInt(1000, 1500);
                    System.out.println(Thread.currentThread().getName()+" Consumes product: "+buffer.getFirst());
                    buffer.removeFirst();
                    productCount--;
                    if(productCount <=0){
                        return;
                    }
                    bufferLock.release();
                    Thread.sleep(sleepTime);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        producer product = new producer(5);
        producer product_ = new producer(8);
        Thread producer1 = new Thread(product);
        producer1.setName("Producer1");
        Thread producer2 = new Thread(product_);
        producer2.setName("Producer2");
        consumer consumption = new consumer();
        Thread consumer = new Thread(consumption);
        consumer.setName("Consumer");
        producer1.start();
        consumer.start();
        producer2.start();

    }
}
