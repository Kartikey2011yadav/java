package AdvanceJava.Collections;

import java.util.*;
public class WeakHashMapGeneric
{
    public static void main(String[] args)
    {
        Map<String,String> m =new WeakHashMap<>();
        m.put("ABC", "XYZ");
        m.put("abc","xyz");
        System.out.println(m.get("ABC"));
        System.out.println(m);
        m.remove("abc");
        System.out.println(m);
    }
}