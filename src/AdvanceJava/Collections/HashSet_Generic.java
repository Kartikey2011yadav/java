package AdvanceJava.Collections;

import java.util.HashSet;

public class HashSet_Generic
{
    public static void main(String[] args)
    {
        HashSet<String> hs=new HashSet<>();
        hs.add("Python");
        hs.add("Java");
        hs.add("Java Script");
        System.out.println("The HashSet is:"+hs);

    }
}
