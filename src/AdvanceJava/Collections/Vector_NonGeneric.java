package AdvanceJava.Collections;

import java.util.Vector;

public class Vector_NonGeneric
{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.add("Start");
        for(int i=0;i<5;i++)
        {
            v.add(i);
        }
        v.add("End");
        System.out.println("Before the Deletion :"+v);
        v.remove(2);
        System.out.println("After Deletion :"+v);
    }
}
