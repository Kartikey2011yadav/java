package AdvanceJava.Collections;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_ForEach {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>(Arrays.asList(1,23,45,67,89,98,87,76,65,54,43,32,21,10));
        System.out.println("Elements of set:");
        for (int num:set) {
            System.out.println(num);
        }

    }
}
