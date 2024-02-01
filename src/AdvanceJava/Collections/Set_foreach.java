package AdvanceJava.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_foreach
{
    public static void main(String[] args)
    {
        Set<String> hs=new HashSet<>();
        hs.add("Python");
        hs.add("Java");
        hs.add("MTech IT");
        hs.add("25");
        for(String i:hs)
        {
            System.out.println("Element:"+i);
        }
    }
}
