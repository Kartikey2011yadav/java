package AdvanceJava.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_iterator
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(3);
        hs.add(8);
        hs.add(5);
        hs.add(1);
        hs.add(9);

        System.out.println("Printing Hashset element using iterator:");
        Iterator<Integer> itr=hs.iterator();

        while (itr.hasNext())
        {
            System.out.println("Element:"+ itr.next());
        }

    }
}
