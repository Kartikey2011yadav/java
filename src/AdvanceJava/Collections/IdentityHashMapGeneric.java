package AdvanceJava.Collections;

import java.util.*;
public class IdentityHashMapGeneric
{
    public static void main(String[] args)
    {
        Map<String,String> m=new IdentityHashMap<>();
        m.put("ABC", "XYZ");
        m.put("abc","xyz");
        System.out.println(m);
        if(m.containsKey("ABC"))
        {
            System.out.println(m.get("ABC"));
        }
        m.remove("ABC");
        System.out.println(m);
    }
}