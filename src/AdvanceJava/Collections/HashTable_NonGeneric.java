package AdvanceJava.Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_NonGeneric {
    public static void main(String[] args) {
        Map data = new Hashtable();
        data.put(101,"Good Morning");
        data.put("Kartikey",25);
        data.put("Advance Java",87.73);
        data.put("ADA",82.35);
        data.put("UNIX",91.04);
        data.put("Sys Programming",74.96);
        System.out.println(data);
    }
}
