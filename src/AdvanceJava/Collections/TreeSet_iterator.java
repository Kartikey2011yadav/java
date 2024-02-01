package AdvanceJava.Collections;

import java.util.Iterator;

public class TreeSet_iterator
{
    public static void main(String[] args)
    {
        java.util.TreeSet<String> tree_set=new java.util.TreeSet<>();
        tree_set.add("A");
        tree_set.add("C");
        tree_set.add("L");
        tree_set.add("Y");
        tree_set.add("F");

        Iterator itr=tree_set.descendingIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
