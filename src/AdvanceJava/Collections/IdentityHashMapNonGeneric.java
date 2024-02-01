package AdvanceJava.Collections;

import java.util.*;
public class IdentityHashMapNonGeneric
{
    public static void main(String[] args)
    {
        Map m = new IdentityHashMap();
        m.put(1,"abc");
        m.put("ABC",1);
        System.out.println(m);
        if(m.containsKey("ABC"))
        {
            System.out.println(m.get("ABC"));
        }
        m.remove("ABC");
        System.out.println(m);
    }
}