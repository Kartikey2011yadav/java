package ADA;

class printJobs{
    private final String id;
    private final int size;
    private final boolean isColored;
    private final int priority;

    public printJobs(String id, int size, boolean isColored, int priority) {
        this.id = id;
        this.size = size;
        this.isColored = isColored;
        this.priority = priority;
    }

    public String getId() {
        return id;
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
    public static void main(String[] args) {

    }

}
