package AdvanceJava.Collections;

import java.util.Vector;

public class Vector_foreach
{
    public static void main(String[] args)
    {
        Vector<String> v=new Vector<>();
        v.add("Start");
        v.add("First");
        v.add("Second");
        v.add("Third");
        v.add("Fourth");
        v.add("End");

        for (String s:v) {
            System.out.println(s);
        }
    }
}
