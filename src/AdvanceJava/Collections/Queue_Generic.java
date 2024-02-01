package AdvanceJava.Collections;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue_Generic
{
    public static void main(String[] args)
    {
        Queue<String> prior=new PriorityBlockingQueue<>();
        prior.add("Java");
        prior.add("Kartikey");
        prior.add("Python");
        System.out.println(prior);
    }
}
