package AdvanceJava.Collections;

import java.util.Stack;

public class Stack_foreach
{
    public static void main(String [] args)
    {
        String[] arr = { "Kartikey", "Mtech", "Java", "25" };
        Stack<String> stk=new Stack<>();
        for (String str : arr) {
            stk.push(str);
        }
        stk.pop();
        for (String s:stk) {
            System.out.println(s);
        }
    }
}
