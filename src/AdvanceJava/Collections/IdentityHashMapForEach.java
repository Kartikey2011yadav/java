package AdvanceJava.Collections;

import java.util.*;
public class IdentityHashMapForEach
{
    public static void main(String[] args)
    {
        Map<String,String> m = new IdentityHashMap<>();
        m.put("ABC","XYZ");
        m.put("abc","xyz");
        for(Map.Entry<String,String> s:m.entrySet())
        {
            System.out.println(s.getKey()+" : "+s.getValue());
        }
    }
}