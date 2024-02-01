package syllabus;

import java.util.Scanner;
public class Question45 {
    private int Num;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5 Digit number: ");
        Num = sc.nextInt();
        if(Integer.toString(Num).length() != 5){
            System.out.print("Please re-enter the number correctly....");
            this.input();
        }
        sc.close();
    }
    boolean checkPalindrome(){
        String num = Integer.toString(Num);
        StringBuilder numRev = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            numRev.insert(0, num.charAt(i));
        }
        return num.contentEquals(numRev);
    }
    public static void main(String[] args) {
        Question45 q = new Question45();
        q.input();
        if(q.checkPalindrome()){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}
