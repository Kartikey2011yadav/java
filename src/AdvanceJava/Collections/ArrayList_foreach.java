package AdvanceJava.Collections;

import java.util.*;

public class ArrayList_foreach
{
    public static void main(String []args)
    {
        ArrayList<String> n = new ArrayList<>();
        n.add("Kartikey");
        n.add("Cotishq");
        n.add("Koham Sothari");
        n.add("Jakie");
        for (String s:n) {
            System.out.println("name: "+s);
        }
    }
}
