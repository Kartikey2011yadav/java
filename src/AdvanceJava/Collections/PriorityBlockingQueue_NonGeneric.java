package AdvanceJava.Collections;

import java.util.Arrays;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_NonGeneric
{
    public static void main(String[] args) throws InterruptedException
    {
        PriorityBlockingQueue pbq=new PriorityBlockingQueue(Arrays.asList("Kartikey","25","546.5","Java"));
        System.out.println(pbq);
    }
}
