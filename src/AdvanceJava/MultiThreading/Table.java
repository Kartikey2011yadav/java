package AdvanceJava.MultiThreading;

import java.util.HashMap;
import java.util.Map;

public class Table implements Runnable {
    static Map<Integer,Integer> table = new HashMap<>();
    int index;

    public Table(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        table.put(index,index*13);
    }

    public static void main(String[] args) throws InterruptedException {
        Table[] threads = new Table[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Table(i+1);
            Thread t = new Thread(threads[i]);
            t.start();
        }
        Thread.sleep(1500);
        System.out.println("Table of 12: ");
        table.forEach((k,v)->{
            System.out.println(k+" x 12 = "+v);
        });
    }
}
