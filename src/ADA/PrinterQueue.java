package ADA;

import java.util.Hashtable;

class printJobs{
    private final int size;
    private final boolean isColored;
    private final int priority;

    public printJobs(int size, boolean isColored, int priority) {
        this.size = size;
        this.isColored = isColored;
        this.priority = priority;
    }

    public int getSize() {
        return size;
    }

    public boolean isColored() {
        return isColored;
    }

    public int getPriority() {
        return priority;
    }
}

public class PrinterQueue {
    private Hashtable<String,printJobs> jobs= new Hashtable<>();

    void addJob(String id, int pr, int size, boolean isColor){
        jobs.put(id,new printJobs(size,isColor,pr));
    }

    public static void main(String[] args) {

    }

}
