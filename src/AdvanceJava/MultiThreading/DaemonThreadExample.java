package AdvanceJava.MultiThreading;

public class DaemonThreadExample extends Thread{

    public void run(){

        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread executing");
        }
        else{
            System.out.println("user(normal) thread executing");
        }
    }
    public static void main(String[] args){

        DaemonThreadExample t1=new DaemonThreadExample();
        DaemonThreadExample t2=new DaemonThreadExample();

        t1.setDaemon(true);

        t1.start();
        t2.start();
    }
}
