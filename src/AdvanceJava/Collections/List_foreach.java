package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class List_foreach
{
    public static void main(String[] args)
    {
        List<String> arr=new ArrayList<>();
        arr.add("Advance Java");
        arr.add("Kartikey");
        arr.add("29 Jan");
        arr.add("6th sem");
        for (String i:arr) {
            System.out.println("Elements : "+i);
        }
    }
}
