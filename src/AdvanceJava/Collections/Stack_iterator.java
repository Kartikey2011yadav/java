package AdvanceJava.Collections;

import java.util.Iterator;
import java.util.Stack;

public class Stack_iterator
{
    public static void main(String [] args)
    {
        String[] arr = {"Kartikey", "Mtech", "Java", "25"};
        Stack<String> stk=new Stack<>();
        for (String s : arr) {
            stk.push(s);
        }
        Iterator<String> itr=stk.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
