package AdvanceJava.Collections;

import java.util.LinkedList;
import java.util.List;

public class List_NonGeneric
{
    public static void main(String[] args)
    {
        List arr=new LinkedList();
        arr.add("Hello");
        arr.add("Kartikey");
        arr.add(25);
        arr.add(97.58);

        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        arr.reversed();
        System.out.println("List elements:");
        arr.forEach(System.out::println);
    }
}
