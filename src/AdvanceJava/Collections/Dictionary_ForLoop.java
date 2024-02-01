package AdvanceJava.Collections;

import java.util.*;

public class Dictionary_ForLoop
{
    public static void main(String[] args)
    {
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("Kartikey", 25);
        dict.put("Zakie", 31);
        dict.put("Soham", 65);
        dict.put("Tanishq", 87);
        Enumeration <String>enu1 = dict.keys();

        while (enu1.hasMoreElements()) {
            String key= enu1.nextElement();
            Integer value=dict.get(key);
            System.out.println(key+":"+value);
        }
    }

}
