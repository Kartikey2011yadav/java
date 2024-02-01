package AdvanceJava.Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Hashable_Iterator
{
    public static void main(String[] args)
    {
        Hashtable<String,Integer> hash =new Hashtable<>();
        hash.put("Kartikey",25);
        hash.put("Zakie",31);
        hash.put("Soham",65);
        hash.put("Tanishq",87);

        Iterator<Map.Entry<String, Integer>> itr = hash.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry rec = itr.next();
            System.out.println("Roll no: "+rec.getValue()+" Name: "+rec.getKey());
        }
    }
}
