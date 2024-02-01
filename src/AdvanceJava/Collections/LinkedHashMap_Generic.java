package AdvanceJava.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Generic {
    public static void main(String[] args) {
        int tableOf = (int) (Math.random() * 100);
        Map<Integer,Integer> RandomTable =new LinkedHashMap<>();
        for (int i = 1; i < 11; i++) {
            RandomTable.put(i,i*tableOf);
        }
        for (Map.Entry<Integer,Integer> table: RandomTable.entrySet()) {
            System.out.println(tableOf+" x "+table.getKey()+" = "+table.getValue() );
        }
    }
}
