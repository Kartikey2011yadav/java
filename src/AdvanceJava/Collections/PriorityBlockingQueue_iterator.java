package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_iterator
{
    public static void main(String[] args) throws InterruptedException
    {
        PriorityBlockingQueue<String> priorblock=new PriorityBlockingQueue<>();
        priorblock.put("Kartikey");
        priorblock.put("25");
        priorblock.put("Java");
        System.out.println("Iterating through the iterator Loop");
        Iterator<String> itr=priorblock.iterator();
        while (itr.hasNext())
        {
            System.out.println("Element in Queue is "+itr.next());
        }
    }
}
