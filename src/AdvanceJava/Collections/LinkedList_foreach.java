package AdvanceJava.Collections;

import java.util.LinkedList;

public class LinkedList_foreach
{
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("Hello");
        list.add("Java");
        list.add("World");
        for (String s:list) {
            System.out.println(s);
        }
    }

}
