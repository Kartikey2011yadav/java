package Collections.Theatre;

import java.util.*;

public class Arrayex {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Jakie");
        names.add("zack");
        names.add("nathkhat");
        names.add("NPC");
        names.add("tanishq Swifty");
        names.add(1);

        Iterator<Object> itr= names.iterator();
        while(itr.hasNext()){
            System.out.println("name: "+itr.next());
        }
        for (int i = 0; i < names.size() ; i++) {
            System.out.println("name: "+ names.get(i));
        }
        for (Object n: names) {
            System.out.println("name: "+n);
        }
        System.out.println(names);
    }
}
