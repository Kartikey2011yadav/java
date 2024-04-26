package Collections.Theatre;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PBQ {
    public static void main(String[] args){
        Queue<String> queue=new PriorityQueue<String>();
        queue.add("Raj");
        queue.add("Amit Sharma");
        queue.add("JaiShankar");
        queue.add("Vijay Raj");
        queue.add("Vijay Raj");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
