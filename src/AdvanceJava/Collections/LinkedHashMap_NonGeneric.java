package AdvanceJava.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_NonGeneric {
    public static void main(String[] args) {
        Map Days = new LinkedHashMap();
        Days.put("Monday","It's a nice day");
        Days.put(2,"welcome to tuesday");
        Days.put("Wed",3);
        Days.put("thursady","it's sunny today");
        Days.put("troll trauma & tears",696.66);
        Days.put("Sunday","Finally a day off");
        System.out.println("Non Generic Linked Hash Map Records: ");
        Days.forEach((key, val)->{
            System.out.println(key+" => "+val);
        });
    }
}
