package Experiment;

public class Innerclass {
    class hi{
        void display(){
            System.out.println("display");
        }
        class hola{
            void dis(){
                System.out.println("hola obj");
            }
        }
    }
    void acc(){
        hi hello = new hi();
        hello.display();
    }

    public static void main(String[] args) {
        Innerclass in = new Innerclass();
        in.acc();
        Innerclass.hi h = in.new hi();
        h.display();
        Innerclass.hi.hola hi = h.new hola();
        hi.dis();
    }
}
