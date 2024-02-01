package AdvanceJava.Collections;

import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary_Generic {
    public static void main(String[] args) {
        Dictionary<Integer,String> dict = new Hashtable<>();
        dict.put(101, "Sydney");
        dict.put(102, "Brisbane");
        dict.put(103, "Melbourne");
        dict.put(104, "Perth");
        dict.put(105, "Lismore");
        dict.put(106, "Mount Gambier");

        System.out.println(dict);
    }
}
