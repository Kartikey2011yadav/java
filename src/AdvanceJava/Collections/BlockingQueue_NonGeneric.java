package AdvanceJava.Collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue_NonGeneric
{
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue bq=new ArrayBlockingQueue(5) ;
        bq.put("x");
        bq.put("Kartikey");
        bq.put(25);
        bq.put("IT-25");
        System.out.println(bq);
    }
}
