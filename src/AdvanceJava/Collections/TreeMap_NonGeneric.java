package AdvanceJava.Collections;

import java.util.TreeMap;
import java.util.Map;

public class TreeMap_NonGeneric {
    public static void main(String[] args) {
        Map data = new TreeMap();
        data.put(1,"Good morning");
        data.put(365,"No of days in year");
        data.put(7,"days in week");
        data.put(25,"Kartikey");
        data.put(94,"Adv. Java Marks");

        data.forEach((k,v)->{
            System.out.println(k+" => "+v);
        });
    }
}
