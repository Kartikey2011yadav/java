package AdvanceJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class TreeMap_ForEach {
    public static void main(String[] args) {
        Map<String,Double> salary = new HashMap<>();
        salary.put("Zakie",85000.5);
        salary.put("Kartikey",78000.79);
        salary.put("Tanishq",57006.94);
        salary.put("Soham",69.96);
        salary.put("Joe",64000.0);

        for (Map.Entry<String,Double> rec: salary.entrySet()) {
            System.out.println("Name: "+rec.getKey()+" Salary: "+rec.getValue());

        }
    }
}
