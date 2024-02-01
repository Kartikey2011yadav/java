package AdvanceJava.Collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue_Generic
{
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq=new ArrayBlockingQueue<>(5) ;
        bq.put("IT");
        bq.put("Kartikey");
        bq.put("IT-2k21-25");
        bq.put("Adv. Java");
        System.out.println(bq);
    }
}
