package AdvanceJava.MultiThreading;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Fibonacci extends Thread
{
    public void run()
    {
        try
        {
            int a=0, b=1, c=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the Limit for fabonacci: ");

            int n = Integer.parseInt(br.readLine());
            System.out.println("\n=================================");
            System.out.println("Fibonacci series:");
            while (n>0)
            {
                System.out.print(c+" ");
                a=b;
                b=c;
                c=a+b;
                n=n-1;
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        try
        {
            Fibonacci fib = new Fibonacci();
            fib.start();
            fib.sleep(4000);

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
