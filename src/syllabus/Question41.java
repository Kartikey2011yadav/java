package syllabus;

import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance for Account: ");
        Account acc = new Account(sc.nextDouble());
        System.out.println("Account Balance: "+acc.getBalance());
        sc.close();
    }
}
