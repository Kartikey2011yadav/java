package AdvanceJava.Collections;

import java.util.Hashtable;

public class Hashable_Generic
{
    public static void main(String[] args)
    {
        Hashtable<String,Integer> hash =new Hashtable<>();
        hash.put("Kartikey",25);
        hash.put("Zakie",31);
        hash.put("Soham",65);
        hash.put("Tanishq",87);
        System.out.println(hash);
    }
}
