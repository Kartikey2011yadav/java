package syllabus;

import java.util.Scanner;

public class Question18 {
    boolean armstrongNum(int num){
        int len = Integer.toString(num).length();
        int val = 0;
        int Num = num;
        for(int i=0; i<len; i++){
            val += (int) Math.pow(num % 10, len);
            num /= 10;
        }
        return Num == val;
    }

    public static void main(String[] args) {
        Question18 arm = new Question18();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(arm.armstrongNum(n)){
            System.out.println("Entered number "+n+" is a armstrong Number");
        }
        else System.out.println("Entered number "+n+" is not a armstrong Number");
    }
}
