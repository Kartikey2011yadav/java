package syllabus;

import java.util.Scanner;

public class Question12 {
    int time;
    double rate;
    double principle;
    int n;

    public Question12(int time, double rate, double principle, int n) {
        this.time = time;
        this.rate = rate / 100;
        this.principle = principle;
        this.n = n;
    }

    double compoundInterest(){
        double Amount = 1.0;
        for(int i= 0; i< time*n; i++){
            Amount *= (double) (1 +(rate/ n));
        }
        Amount *= principle;
        return Amount - principle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest (in %): ");
        double r = sc.nextDouble();
        System.out.print("Enter Time in Years: ");
        int t = sc.nextInt();
        System.out.print("Enter number of times interest is compounded: ");
        int n = sc.nextInt();

        Question12 calInterest = new Question12(t, r, p, n);
        System.out.print("Compound Interest :" + calInterest.compoundInterest());
    }
}
