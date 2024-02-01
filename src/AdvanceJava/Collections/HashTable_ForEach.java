package AdvanceJava.Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_ForEach {
    public static void main(String[] args) {
        Map<Integer,String> students = new Hashtable<>();
        students.put(25,"Kartikey");
        students.put(31,"Zakie");
        students.put(58,"Soham");
        students.put(11,"Arindham");
        students.put(5,"Akansha");
        students.put(33,"Namaskruti");
        students.put(56,"Samarth");

        for (Map.Entry<Integer,String> rec: students.entrySet()){
            System.out.println("Student: "+rec.getValue()+" Roll No. "+rec.getKey());
        }
    }
}
