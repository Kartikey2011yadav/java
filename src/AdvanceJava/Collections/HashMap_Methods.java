package AdvanceJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Methods {
    public static void main(String[] args) {
        Map<String, Integer> Salary = new HashMap<>();
        
        Salary.put("Joe", 20000);
        Salary.put("Ben", 30000);
        Salary.put("Zack", 15000);
        Salary.put("Ryan", 19000);
        Salary.put("smith", 22000);
        Salary.put("simon", 21000);
        System.out.println("HashMap: " + Salary);

        Salary.compute("Zack", (key, value) -> value + value * 30/100);
        System.out.println("Zack get salary hick(30%) and his new Salary: " + Salary.getOrDefault("Zack",0));
        
        System.out.println("Updated HashMap: " + Salary);
    }

}
