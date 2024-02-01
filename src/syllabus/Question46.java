package syllabus;

import java.util.Scanner;
public class Question46 {
    private int A,B,C;
    boolean nonZero(int num){
        return num == 0;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        A = sc.nextInt();
        System.out.print("Enter Second Number: ");
        B = sc.nextInt();
        System.out.print("Enter Third Number: ");
        C = sc.nextInt();
        if(nonZero(A) || nonZero(B) || nonZero(C)){
            System.out.println("Entered number was found Zero re-enter....");
            this.input();
        }
        this.result();
    }
    void result(){
        System.out.println("Sum: "+sum());
        System.out.println("Product: "+product());
        System.out.println("Average: "+average());
        System.out.println("Greatest Number: "+greatestNum());
        System.out.println("Smallest Number: "+smallestNum());
    }
    int greatestNum(){
        int greatest = Math.max(A, B);
        return Math.max(C, greatest);
    }
    int smallestNum(){
        int smallest = Math.min(A, B);
        return Math.min(C, smallest);
    }
    int sum(){
        return (A+B+C);
    }

    double average(){
        return (double) (A + B + C) /3;
    }

    int product(){
        return (A*B*C);
    }

    public static void main(String[] args) {
        Question46 q = new Question46();
        q.input();
        System.out.println();
    }
}
