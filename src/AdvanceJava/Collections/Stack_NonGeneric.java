package AdvanceJava.Collections;

import java.util.Stack;

public class Stack_NonGeneric
{
    public static void main(String [] args)
    {
        String[] array = {"Kartikey", "Mtech", "Java" };
        Stack stk=new Stack();
        for (String s : array) {
            stk.push(s);
        }
        stk.push(25);
        System.out.println(stk);
    }
}
