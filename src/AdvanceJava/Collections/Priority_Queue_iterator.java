package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue_iterator
{
    public static void main(String[] args)
    {
        PriorityQueue<String> prior=new PriorityQueue<>();
        prior.add("Kartikey");
        prior.add("IT - 25");
        prior.add("Java");
        System.out.println("Iterating through the iterator Loop");
        Iterator<String> itr= prior.iterator();
        while (itr.hasNext())
        {
            System.out.println("Element: "+itr.next());
        }
    }
}
