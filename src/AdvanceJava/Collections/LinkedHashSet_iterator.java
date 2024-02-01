package AdvanceJava.Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_iterator
{

    public static void main(String[] args)
    {
        LinkedHashSet<Integer> lh = new LinkedHashSet<>(Arrays.asList(3, 0, 9, 4, 2));
        Iterator<Integer> itr= lh.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
