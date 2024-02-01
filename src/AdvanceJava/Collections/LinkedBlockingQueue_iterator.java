package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingQueue_iterator
{
    public static void main(String[] args) throws InterruptedException
    {
        LinkedBlockingDeque<String> linkblock=new LinkedBlockingDeque<>();
        linkblock.add("Kartikey");
        linkblock.add("25");
        linkblock.add("Java");

        Iterator<String> itr=linkblock.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
