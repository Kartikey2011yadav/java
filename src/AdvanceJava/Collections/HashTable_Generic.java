package AdvanceJava.Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_Generic {
    public static void main(String[] args) {
        Map<Integer,String> Num = new Hashtable<>();
        Num.put(1,"One");
        Num.put(2,"Two");
        Num.put(3,"Three");
        Num.put(4,"Four");
        Num.put(5,"Five");

        Num.forEach((k,v)->{
            System.out.println(k+" => "+v);
        });
    }
}
