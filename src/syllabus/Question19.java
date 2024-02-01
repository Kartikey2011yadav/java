package syllabus;

import java.util.Scanner;

public class Question19 {
    boolean isPrime(int num){
        for(int i = num-1; i >=(int)num/2; i--) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Question19 prime = new Question19();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(prime.isPrime(n)){
            System.out.println("Entered number "+n+" is a Prime Number");
        }
        else System.out.println("Entered number "+n+" is not a Prime Number");
    }
}

