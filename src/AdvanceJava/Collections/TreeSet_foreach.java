package AdvanceJava.Collections;
import java.util.Arrays;
import java.util.TreeSet;
public class TreeSet_foreach
{
    public static void main(String[] args)
    {
        TreeSet<String> ts=new TreeSet<>(Arrays.asList("A","C","F","L","Y"));
        System.out.println("Iterating with For Each Loop");
        for (String s:ts) {
            System.out.println(s);
        }
    }
}
