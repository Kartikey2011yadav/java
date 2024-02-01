package Experiment;

public class constructor {
    float hi;
    private constructor( float  x){
        hi = x;
    }
    void display(){
        System.out.println(hi);
    }

    public static void main(String[] args) {
        constructor c = new constructor(3.1415f);
        c.display();
    }
}
