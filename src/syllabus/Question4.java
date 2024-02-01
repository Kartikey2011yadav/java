package syllabus;

import java.util.Scanner;

public class Question4 {
    int a,b,c,d,e;
    public Question4(int a, int b,int c,int d,int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    double Avg(){
        return (double) (a + b + c + d + e) /5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int FirstNum = sc.nextInt();
        System.out.print("Enter Second Number:");
        int SecondNum = sc.nextInt();
        System.out.print("Enter Third Number:");
        int ThirdNum = sc.nextInt();
        System.out.print("Enter Fourth Number:");
        int FourthNum = sc.nextInt();
        System.out.print("Enter Fifth Number:");
        int FifthNum = sc.nextInt();

        Question4 q = new Question4(FirstNum,SecondNum,ThirdNum,FourthNum,FifthNum);
        System.out.println("Biggest Number: "+q.Avg());
    }
}
