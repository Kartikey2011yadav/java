package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_iterator
{
    public static void main(String[] args)
    {
        List<String> arr=new ArrayList<>();
        arr.add("Kartikey");
        arr.add("IT-2k21-25");
        arr.add("Advance Java");
        arr.add("6th sem");
        Iterator itr=arr.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}