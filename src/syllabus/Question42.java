package syllabus;

import java.util.Scanner;

public class Question42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance for Account: ");
        Account acc = new Account(sc.nextDouble());
        System.out.println("Account Balance: "+acc.getBalance());
        System.out.print("Enter amount you want to insert to account: ");
        acc.credit(sc.nextDouble());
        System.out.println("Current Balance of Account: "+acc.getBalance());
        sc.close();
    }
}
