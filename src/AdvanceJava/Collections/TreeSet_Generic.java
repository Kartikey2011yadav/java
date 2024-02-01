package AdvanceJava.Collections;
import java.util.TreeSet;
public class TreeSet_Generic
{
    public static void main(String[] args)
    {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("A");
        ts.add("L");
        ts.add("C");
        ts.add("Y");
        ts.add("F");

        System.out.println(ts);
        System.out.println("D Ceil Element:"+ts.ceiling("D"));
        System.out.println("D Floor Element:"+ts.floor("D"));
        System.out.println("First Element:"+ts.first());
        System.out.println("Last Element:"+ts.last());
    }

}
