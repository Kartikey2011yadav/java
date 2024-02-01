package AdvanceJava.Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSet_Generic
{
    public static void main(String[] args)
    {
        Integer[] arr =new Integer[]{3,0,9,4,2};
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>(Arrays.asList(arr));
        Integer[] arr1 =new Integer[]{55,10,9,4,2};
        LinkedHashSet<Integer> intersect=new LinkedHashSet<>(Arrays.asList(arr1));
        System.out.println("Linked Hash Set 1:"+lhs);
        System.out.println("Linked Hash Set 2:"+intersect);
        intersect.retainAll(lhs);
        System.out.println("Intersection of Linked Hash Set:"+intersect);
    }
}
