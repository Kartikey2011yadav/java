package AdvanceJava.Collections;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_Generic
{
    public static void main(String[] args) throws InterruptedException
    {
        PriorityBlockingQueue<String> pbq=new PriorityBlockingQueue<>();
        pbq.put("Kartikey");
        pbq.put("25");
        pbq.put("Java");
        System.out.println(pbq);
    }
}
