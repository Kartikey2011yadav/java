package AdvanceJava.Collections;

import java.util.*;
public class IdentityHashMapIterator
{
    public static void main(String[] args)
    {
        Map<String,String> m = new IdentityHashMap<>();
        m.put("ABC","XYZ");
        m.put("abc","xyz");
        Iterator<Map.Entry<String,String>> itr = m.entrySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}