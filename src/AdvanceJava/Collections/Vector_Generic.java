package AdvanceJava.Collections;

import java.util.Vector;

public class Vector_Generic
{
    public static void main(String[] args)
    {
            Vector <String>v=new Vector<>();
            v.add("Start");
            v.add("First");
            v.add("Second");
            v.add("End");
            System.out.println("Before the Deletion :"+v);
            v.remove(3);
            System.out.println("After Deletion :"+v);
    }
}
