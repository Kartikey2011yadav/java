package AdvanceJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_NonGeneric {
    public static void main(String[] args) {
        Map records = new HashMap();
        records.put(101,"Good Morning");
        records.put("Kartikey",25);
        records.put("Advance Java",87.73);
        records.put("Sys Programming",74.96);
        records.put("UNIX",91.04);
        records.put("ADA",82.35);
        System.out.println(records);
    }
}
