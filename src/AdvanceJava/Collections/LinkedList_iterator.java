package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_iterator
{

    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<>();

        list.add("Bring Bang Bang");
        list.add("Bring Bang Bang");
        list.add("Bring Bang Bang Born");

        Iterator itr=list.iterator();
        System.out.print(itr.next());
        while (itr.hasNext())
        {
            System.out.print("->"+itr.next());
            itr.remove();
        }
        System.out.println("\nAfter the Iterator:");
        System.out.println(list);
    }

}
