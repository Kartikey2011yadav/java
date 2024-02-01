package AdvanceJava.Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Generic {
    public static void main(String[] args) {
        Map<Integer,String> Employee = new TreeMap<>();
        Employee.put(101,"Kartikey");
        Employee.put(157,"Tanishq");
        Employee.put(178,"Joe");
        Employee.put(146,"Soham");
        Employee.put(104,"Smith");
        Employee.put(132,"Zakie");

        Employee.forEach((key,val)->{
            System.out.println("Employ Name: "+val+" Id: "+key);
        });
    }
}
