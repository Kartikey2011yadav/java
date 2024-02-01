package AdvanceJava.Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSet_foreach
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> linked_hash = new LinkedHashSet<>(Arrays.asList(3, 0, 9, 4, 2));
        for (Integer i:linked_hash) {
            System.out.println("element iteration using foreach "+i);
        }
    }
}
