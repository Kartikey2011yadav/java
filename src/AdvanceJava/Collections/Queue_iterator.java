package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue_iterator
{
    public static void main(String[] args) throws InterruptedException
    {
        Queue<String> priorblock=new PriorityBlockingQueue<>();
        priorblock.add("Java");
        priorblock.add("Kartikey");
        priorblock.add("It-2k21-25");
        Iterator <String> itr =priorblock.iterator();
        System.out.println("Iterating element using iterator");
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
