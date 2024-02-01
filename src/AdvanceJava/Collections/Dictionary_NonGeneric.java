package AdvanceJava.Collections;

import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary_NonGeneric
{
    public static void main(String[] args)
    {
        Dictionary dict =new Hashtable();
        dict.put("Kartikey","25");
        dict.put("Zakie",31);
        dict.put("Soham",65);
        dict.put("Tanishq","87");

        System.out.println(dict);
    }
}
