package AdvanceJava.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_NonGeneric
{
    public static void main(String[] args)
    {
        Set hs=new HashSet();
        hs.add("Python");
        hs.add("Java");
        hs.add(25);
        System.out.println("The Set is:"+hs);

    }
}
