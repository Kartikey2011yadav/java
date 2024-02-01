package AdvanceJava.Collections;

import java.util.*;
public class NavigableMapGeneric
{   
    public static void main(String[] args)
    {
        NavigableMap<String,String> m = new TreeMap<>();
        m.put("ABC","abc");
        m.put("XYZ","xyz");
        System.out.println(m);
        if(m.containsKey("ABC"))
        {
            System.out.println(m.get("ABC"));
        }
        m.remove("ABC");
        System.out.println(m);
    }
}