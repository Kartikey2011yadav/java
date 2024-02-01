package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Generic
{
    public static void main(String [] args)
    {
        List <String>arr=new ArrayList<>();
        arr.add("Kartikey");
        arr.add("IT-2k21-25");
        arr.add("Advance Java");
        arr.add("MTech IT 6th sem");
        System.out.println(arr.getLast());
        System.out.println(arr.getFirst());
        System.out.println(arr.contains("Advance Java"));
        System.out.println(arr.remove("MTech IT 6th sem"));
        System.out.println(arr);
    }
}
