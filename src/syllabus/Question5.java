package syllabus;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int FirstNum = sc.nextInt();
        System.out.print("Enter Second Number:");
        int SecondNum = sc.nextInt();
        if(FirstNum % SecondNum == 0){
            System.out.println(FirstNum+" is divisible by "+SecondNum);
        }
        else {
            System.out.println(FirstNum+" is not divisible by "+SecondNum);
        }
    }
}
