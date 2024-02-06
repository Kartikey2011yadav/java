package AdvanceJava.MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String EOF = "EOF";
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();

        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.setName("producerThread");

        Thread consumerThread1 = new Thread(new Consumer(buffer));
        consumerThread1.setName("consumerThread1");

        Thread consumerThread2 = new Thread(new Consumer(buffer));
        consumerThread2.setName("consumerThread2");

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
