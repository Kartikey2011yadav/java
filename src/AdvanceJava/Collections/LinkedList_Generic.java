package AdvanceJava.Collections;

import java.util.LinkedList;

public class LinkedList_Generic
{
    public static void main(String [] args)
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("Kartikey");
        list.add("Tansihq");
        list.add("Soham");
        list.add("Zakie");
        list.forEach(System.out::println);
    }
}
