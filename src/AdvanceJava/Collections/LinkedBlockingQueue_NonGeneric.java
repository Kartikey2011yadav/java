package AdvanceJava.Collections;

import java.util.concurrent.LinkedBlockingDeque;


public class LinkedBlockingQueue_NonGeneric
{
        public static void main(String[] args) throws InterruptedException
        {
            LinkedBlockingDeque linkblock=new LinkedBlockingDeque();
            linkblock.add("Kartikey");
            linkblock.add("Hello Java");
            linkblock.add("Java");
            linkblock.add(25);
            System.out.println(linkblock);
        }

}
