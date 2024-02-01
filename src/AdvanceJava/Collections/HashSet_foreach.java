package AdvanceJava.Collections;

import java.util.HashSet;

public class HashSet_foreach
{
    public static void main(String[] args)
    {
        HashSet<String> hs=new HashSet<>();
        hs.add("Python");
        hs.add("Java");
        hs.add("Java Script");
        System.out.println(hs);
        System.out.println("Printing Hashset using foreach:");

        for (String s:hs) {
            System.out.println(s);
        }
    }
}
