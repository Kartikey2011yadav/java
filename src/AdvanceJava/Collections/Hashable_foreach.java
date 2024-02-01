package AdvanceJava.Collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashable_foreach
{
    public static void main(String[] args) {
        Hashtable<String, Integer> hash = new Hashtable<>();
        hash.put("Kartikey", 25);
        hash.put("Zakie", 31);
        hash.put("Soham", 65);
        hash.put("Tanishq", 87);
        Enumeration<String> keys = hash.keys();
        while(keys.hasMoreElements())
        {
            String key=keys.nextElement();
            System.out.println(key+":"+hash.get(key));
        }

    }
}
