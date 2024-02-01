package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_NonGeneric {
    public static void main(String[] args) {
        List buffer = new ArrayList();
        buffer.add(101);
        buffer.add("Kartikey");
        buffer.add("M.tech(IT) 6th Sem");
        System.out.println(buffer);
        buffer.forEach(System.out::println);
    }
}
