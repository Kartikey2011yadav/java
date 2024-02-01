package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_iterator
{
    public static void main(String [] args)
    {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Kar");
        arr.add("Zak");
        arr.add("Soh");
        arr.add("Tan");
        Iterator itr= arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
