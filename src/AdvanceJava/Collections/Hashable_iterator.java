package AdvanceJava.Collections;

import java.util.Hashtable;
import java.util.Iterator;

public class Hashable_iterator
{
    public static void main(String[] args)
    {
        Hashtable<String,Integer> hash =new Hashtable<>();
        hash.put("Zakie",31);
        hash.put("Kartikey",25);
        hash.put("Soham",65);
        hash.put("Tanishq",87);
        System.out.println(hash);
//        Enumeration<String> keys = hash.keys();
//        while(keys.hasMoreElements())
//        {
//            String key=keys.nextElement();
//            System.out.println(key+":"+hash.get(key));
//        }
        Iterator<String> itr=hash.keys().asIterator();
        Iterator<Integer> itr2=hash.values().iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next()+":"+itr2.next());
        }
    }
}
