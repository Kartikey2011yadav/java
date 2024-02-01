package AdvanceJava.Collections;

import java.util.*;
public class SortedMapForEach
{
    public static void main(String[] args)
    {
        SortedMap<String,String> m = new TreeMap<>();
        m.put("ABC","abc");
        m.put("XYZ","xyz");
        m.forEach((k,v)->
        {
            System.out.println(k+" : "+v);
        });
        for(SortedMap.Entry<String,String> s:m.entrySet())
        {
            System.out.println(s.getKey()+" : "+s.getValue());
        }
    }
}