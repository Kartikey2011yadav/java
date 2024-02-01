package AdvanceJava.Collections;

import java.util.PriorityQueue;

public class Priority_Queue_foreach
{
    public static void main(String[] args)
    {
        PriorityQueue<String> prior=new PriorityQueue<>();
        prior.add("Java");
        prior.add("Kartikey");
        prior.add("25");
        System.out.println("Iterating through the for Each Loop");

        for (String s:prior) {
            System.out.println(s);
        }
    }
}
