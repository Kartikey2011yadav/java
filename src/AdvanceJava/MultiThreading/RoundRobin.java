package AdvanceJava.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class process{
    private final String pId;
    private int time;

    public process(String pId, int time) {
        this.pId = pId;
        this.time = time;
    }

    public String getId() {
        return pId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

public class RoundRobin implements Runnable {

    List<process> processes;
    int cTime;

    public RoundRobin(int pNo) {
        processes = new ArrayList<>();
        cTime = 0;
        for (int i = 0; i < pNo; i++) {
            processes.add(new process("P"+(i+1),2 + (int)(Math.random() * ((10 - 2) + 1))));
        }
        System.out.println("All processes......");
        processes.forEach((p)->{
            System.out.println("Process: "+p.getId()+" Burst Time: "+p.getTime());
        });
    }

    @Override
    public void run() {
        int index = 0;
        try {
            while (true){
                process exeP = processes.get(index);
                // Max CPU time for any process is 2
                int cpuTime = (exeP.getTime() == 1)? 1: 2;

                Thread.sleep(cpuTime*1000);
                System.out.println("Process "+exeP.getId()+" get CPU time of: "+cpuTime);
                cTime += cpuTime;
                if(exeP.getTime()<=cpuTime){
                    processes.remove(index);
                    if(processes.isEmpty()){
                        return;
                    }
                    index = index % processes.size();
                }
                else {
                    exeP.setTime(exeP.getTime()-cpuTime);
                    index = (index+1) % processes.size();
                }

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("The Total Execution Time: "+cTime);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes :");
        int pNo = sc.nextInt();
        RoundRobin sAlgo = new RoundRobin(pNo);
        Thread rrScheduling = new Thread(sAlgo);
        rrScheduling.start();

    }
}
