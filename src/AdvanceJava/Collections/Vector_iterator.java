package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vector_iterator
{
    public static void main(String[] args)
    {
        Vector<String> v=new Vector<>();
        v.add("Start");
        v.add("First");
        v.add("Second");
        v.add("Third");
        v.add("End");

        Iterator<String> itr=v.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
