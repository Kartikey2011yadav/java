package AdvanceJava.Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashset_NonGeneric
{
    public static void main(String[] args)
    {
        LinkedHashSet data = new LinkedHashSet(Arrays.asList(1,"Hello",2,"Java",3,"Mtech IT"));
        System.out.println("Set: "+data);
    }
}
