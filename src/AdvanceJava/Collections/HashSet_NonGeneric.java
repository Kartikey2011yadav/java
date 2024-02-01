package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSet_NonGeneric
{
    public static void main(String[] args)
    {
        ArrayList arr1=new ArrayList();
        arr1.add("Java");
        arr1.add("Python");
        HashSet hs1=new HashSet();
        hs1.add(1);
        hs1.add("Kartikey");
        hs1.add(arr1);
        System.out.println("Set A:"+hs1);
        
        Integer[] arr2 =new Integer[]{1,2,5};
        HashSet union=new HashSet(Arrays.asList(arr2));
        System.out.println("Set B:"+union);

    }
}
