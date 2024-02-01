package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;

public class TreeMap_Iterator {
    public static void main(String[] args) {
        Map<String, Integer> Salary = new TreeMap<>();

        Salary.put("Joe", 20000);
        Salary.put("Ben", 30000);
        Salary.put("Zack", 15000);
        Salary.put("Ryan", 19000);
        Salary.put("Smith", 22000);
        Salary.put("Simon", 21000);

        Iterator records = Salary.entrySet().iterator();

        while (records.hasNext()){
            Map.Entry rec = (Map.Entry)records.next();
            System.out.println(" Name: "+rec.getKey()+" Salary "+rec.getValue());
        }
    }
}
