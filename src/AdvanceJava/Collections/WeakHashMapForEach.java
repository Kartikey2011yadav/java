package AdvanceJava.Collections;

import java.util.*;
public class WeakHashMapForEach
{
    public static void main(String[] args)
    {
        Map<String,String> m=new WeakHashMap<String,String>();
        m.put("ABC","XYZ");
        m.put("abc","xyz");
        m.forEach((key,value) -> 
        {
            System.out.println(key+" : "+value);
        });
        for(Map.Entry<String,String> s:m.entrySet())
        {
            System.out.println(s.getKey()+" : "+s.getValue());
        }
    }
}