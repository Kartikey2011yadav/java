package AdvanceJava.Collections;
import java.util.*;

public class ArrayList_Generic {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John","ken","Jakie","Tom"));
        System.out.println("Names: "+names);
        System.out.println("No of elements: "+names.size());
        System.out.println(names.indexOf("ken"));
    }
}
