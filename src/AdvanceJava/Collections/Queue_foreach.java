package AdvanceJava.Collections;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue_foreach
{
    public static void main(String[] args)
    {
        try{
            Queue<String> priorblock=new PriorityBlockingQueue<>();
            priorblock.add("Kartikey");
            priorblock.add("Java");
            priorblock.add("It-2k21-25");

            System.out.println("Iterating element using for each");
            for (String i:priorblock)
            {
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
