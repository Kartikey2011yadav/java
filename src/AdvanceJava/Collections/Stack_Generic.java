package AdvanceJava.Collections;

import java.util.Stack;

public class Stack_Generic
{
    public static void main(String [] args)
    {
        String[] array = { "Kartikey", "Mtech", "Java" };
        Stack<String> stk=new Stack<>();
        for (String s : array) {
            stk.push(s);
        }
        stk.pop();
        System.out.println(stk);
    }
}
