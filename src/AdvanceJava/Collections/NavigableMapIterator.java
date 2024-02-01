package AdvanceJava.Collections;

import java.util.*;
public class NavigableMapIterator
{
    public static void main(String args[])
    {
        NavigableMap<String,String> m = new TreeMap<String,String>();
        m.put("ABC","abc");
        m.put("XYZ","xyz");
        Iterator<Map.Entry<String,String>> itr = m.entrySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}