package AdvanceJava.multithreading;

public class UnsynchronizedBuffer implements Buffer {
    private int buffer = -1; // shared by producer and consumer threads

    // place value into buffer
    public void set(int value) {
        System.out.printf("Producer writes\t%2d", value);
        buffer = value;
    } // end method set

    // return value from buffer
    public int get() {
        System.out.printf("Consumer reads\t%2d", buffer);
        return buffer;
    } // end method get
} // end class UnsynchronizedBuffer
