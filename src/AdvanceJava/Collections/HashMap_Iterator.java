package AdvanceJava.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Iterator {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
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
            System.out.println("Roll No. "+rec.getKey()+" Name: "+rec.getValue());
        }
    }
}
