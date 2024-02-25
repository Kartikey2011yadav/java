package AdvanceJava.MultiThreading;

public class test implements Runnable{
    static int v;

     synchronized static void display(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ " : "+v);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            v++;
        }

    }

    @Override
    public void run() {
        this.display();
    }

    public static void main(String[] args) {
         test t = new test();
        ThreadGroup g = new ThreadGroup("Thread Grp");
        Thread t1 = new Thread(g,t);
        Thread t2 = new Thread(g,t);
        Thread t3 = new Thread(g,t);
        t1.start();
        t2.start();
        g.list();
        t3.start();


    }
}
