package AdvanceJava.Collections;

import java.util.*;
public class SortedMapIterator
{
    public static void main(String[] args)
    {
        SortedMap<String,String> m = new TreeMap<>();
        m.put("ABC", "abc");
        m.put("XYZ","xyz");
        Iterator<Map.Entry<String,String>> itr = m.entrySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}