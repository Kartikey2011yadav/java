package AdvanceJava.Collections;

import java.util.PriorityQueue;

public class Priority_Queue_Generic
{
    public static void main(String[] args)
    {
        PriorityQueue<String> prior=new PriorityQueue<>();
        prior.add("Java");
        prior.add("Python");
        prior.add("Kartikey");
        System.out.println("Iterating through the for Each Loop");
        System.out.println(prior);
    }
}
