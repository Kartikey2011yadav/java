package AdvanceJava.MultiThreading;

import java.util.List;
import java.util.Random;

class Producer implements Runnable {
    private List<String> buffer;

    public Producer(List<String> buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        String[] numbers = {"1", "2", "3","4"};
        for (String number : numbers) {
            synchronized (buffer) {
                buffer.add(number);
                try {
                    Random random = new Random();
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
            System.out.println(Thread.currentThread().getName() + " added " + number);
        }
        System.out.println(Thread.currentThread().getName() + " added " + Main.EOF);
        synchronized (buffer) {
            buffer.add(Main.EOF+"3");
        }
    }
}
