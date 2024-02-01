package syllabus;

import java.util.Scanner;

public class  Question3 {
    int a,b,c,d,e;
    public Question3(int a, int b,int c,int d,int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    int BigNum(){
        int max = a;
        if(b > max){
            max = b;
        }if(c > max){
            max = c;
        }if(d > max){
            max = d;
        }if(e > max) {
            max = e;
        }
        return  max;
    }

    int SmallNum(){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        if(d < min){
            min = d;
        }
        if(e < min){
            min = e;
        }
        return min;
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

        Question3 q = new Question3(FirstNum,SecondNum,ThirdNum,FourthNum,FifthNum);
        System.out.println("Biggest Number: "+q.BigNum());
        System.out.println("Smallest Number: "+q.SmallNum());
    }
}
