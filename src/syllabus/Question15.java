package syllabus;

import java.util.Scanner;

public class Question15 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter Time in Years: ");
        int t = sc.nextInt();
        System.out.print("Enter number of times interest is compounded: ");
        int n = sc.nextInt();
        for(int i = 5; i <= 10; i++){
            Question12 calInterest = new Question12(t, (double)i, p, n);
            System.out.println("Compound Interest at "+i+ "% interest rate: " + calInterest.compoundInterest());
        }
    }
}
