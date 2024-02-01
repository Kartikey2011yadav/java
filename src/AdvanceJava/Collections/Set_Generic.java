package AdvanceJava.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Generic
{
    public static void main(String[] args)
    {
        Set<String> hs=new HashSet<>();
        hs.add("Java");
        hs.add("Python");
        hs.add("MTech IT");
        System.out.println("The Set is:"+hs);
    }
}
