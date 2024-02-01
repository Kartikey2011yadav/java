package Experiment;

public class hello {
    private int a ;

    public hello(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        hello h = new hello(10);
        System.out.println(h.getA());
        h.setA(20);
        System.out.println(h.getA());
    }
}
