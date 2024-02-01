package AdvanceJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Generic {
    public static void main(String[] args) {
        Map<Integer,Integer> Table = new HashMap<>();
        int tableOf = 24;
        for(int i = 1; i < 11; i++){
            Table.put(i,tableOf*i);
        }

        Table.forEach((key,val)->{
            System.out.println(tableOf+" x "+key+" = "+val );
        });
    }
}
