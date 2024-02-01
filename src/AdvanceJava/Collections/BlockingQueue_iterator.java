package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue_iterator
{
    public static void main(String[] args) throws InterruptedException {
    BlockingQueue<String> bq=new ArrayBlockingQueue<>(5) ;
        bq.put("IT");
        bq.put("Kartikey");
        bq.put("IT-2k21-25");
        bq.put("Adv. Java");

    Iterator<String> itr= bq.iterator();
    while (itr.hasNext())
    {
        System.out.println(itr.next());
    }

}
}
