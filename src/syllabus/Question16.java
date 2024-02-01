package syllabus;

import java.util.Scanner;

public class Question16 {
    int factorial(int num){
        if(num > 1){
            return num *factorial(num -1);
        }
        else return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        Question16 fact = new Question16();
        System.out.println("Factorial of Number "+n+": "+fact.factorial(n));
    }
}
