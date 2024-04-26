package Collections.Theatre;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("1");
        deque.add("2");
        deque.add("3");
        deque.add("4");
        deque.add("32");
        deque.add("5");
        deque.add("6");
        deque.add("7");
        deque.add("8");
        deque.add("9");
        deque.add("10");
        deque.add("11");
        System.out.println(deque);
    }
}
