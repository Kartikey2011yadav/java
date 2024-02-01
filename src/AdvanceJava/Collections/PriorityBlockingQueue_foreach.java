package AdvanceJava.Collections;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_foreach
{
    public static void main(String[] args) throws InterruptedException
    {
        PriorityBlockingQueue<String> priorblock=new PriorityBlockingQueue<>();
        priorblock.put("Kartikey");
        priorblock.put("Java");
        priorblock.put("IT-2k21-25");
        System.out.println("Iterating through the for Each Loop");
        for (String s:priorblock) {
            System.out.println(s);
        }
    }
}
