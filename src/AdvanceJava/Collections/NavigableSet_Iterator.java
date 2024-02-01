package AdvanceJava.Collections;

import java.util.*;

public class NavigableSet_Iterator {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>(Arrays.asList(1,23,45,67,89,98,87,76,65,54,43,32,21,10));
        System.out.println("Elements of set:");
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
