package AdvanceJava.Collections;

import java.util.PriorityQueue;

public class Priority_Queue_NonGeneric
{
    public static void main(String[] args)
    {
        PriorityQueue prior=new PriorityQueue();
        prior.add("Kartikey");
        prior.add("84.54");
        prior.add("205");
        prior.add("Java");
        System.out.println(prior);
    }
}
