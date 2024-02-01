package AdvanceJava.Collections;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public class LinkedHashMap_Iterator {
    public static void main(String[] args) {
        Map<Integer,String> students = new LinkedHashMap<>();
        students.put(25,"Kartikey");
        students.put(31,"Zakie");
        students.put(58,"Soham");
        students.put(11,"Arindham");
        students.put(5,"Akansha");
        students.put(33,"Namaskruti");
        students.put(56,"Samarth");
        Iterator records = students.entrySet().iterator();

        while (records.hasNext()){
            Map.Entry rec = (Map.Entry)records.next();
            System.out.println(" Name: "+rec.getValue()+" Roll No. "+rec.getKey());
        }
    }
}
