package AdvanceJava.Collections;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue_NonGeneric
{
    public static void main(String[] args)
    {
        Queue prior=new PriorityBlockingQueue();
        prior.add(769);
        prior.add(87687);
        prior.add(9808);

        System.out.println(prior);
    }
}
