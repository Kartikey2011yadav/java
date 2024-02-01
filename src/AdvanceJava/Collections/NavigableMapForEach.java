package AdvanceJava.Collections;
import java.util.*;
public class NavigableMapForEach
{
    public static void main(String args[])
    {
        NavigableMap<String,String> m = new TreeMap<String,String>();
        m.put("ABC","XYZ");
        m.put("abc","xyz");
        m.forEach((k,v)->
        {
            System.out.println(k+" : "+v);
        });
        for(Map.Entry<String,String> s: m.entrySet())
        {
            System.out.println(s.getKey()+" : "+s.getValue());
        }
    }
}