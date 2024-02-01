package AdvanceJava.Collections;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingQueue_Generic
{
    public static void main(String[] args) throws InterruptedException
    {
        LinkedBlockingDeque<String> linkblock=new LinkedBlockingDeque<>();
        linkblock.add("Kartikey");
        linkblock.add("25");
        linkblock.add("Java");

        System.out.println(linkblock);
    }

}
