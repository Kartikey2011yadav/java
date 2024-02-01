package AdvanceJava.Collections;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Dictionary_Methods
{
    public static void main(String[] args)
    {
        Dictionary<String,Integer> dict =new Hashtable<>();
        dict.put("Kartikey",25);
        dict.put("Zakie",31);
        dict.put("Soham",65);
        dict.put("Tanishq",87);

        Enumeration<String> k = dict.keys();
        while (k.hasMoreElements()) {
            String key = k.nextElement();
            System.out.println("Name: " + key + " Roll no: " + dict.get(key));
        }
    }
}
