package syllabus;

import java.util.Scanner;

class AccountTest{
    void accountManipulationQ43(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance for Account: ");
        Account accNew = new Account(sc.nextDouble());
        System.out.print("Enter name of account holder: ");
        accNew.Name = sc.next();
        System.out.println("Name of account holder: "+accNew.Name);
        System.out.println("Account Balance: "+accNew.getBalance());
        System.out.print("Enter amount you want to insert to account: ");
        accNew.credit(sc.nextDouble());
        System.out.println("Current Balance of Account: "+accNew.getBalance());
        sc.close();
    }
    void accountManipulationQ44(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance for Account: ");
        Account accNew = new Account(sc.nextDouble());
        System.out.print("Enter name of account holder: ");
        accNew.Name = sc.next();
        System.out.println("Name of account holder: "+accNew.Name);
        System.out.println("Account Balance: "+accNew.getBalance());
        System.out.print("Enter amount you want to insert to account: ");
        accNew.credit(sc.nextDouble());
        System.out.println("Current Balance of Account: "+accNew.getBalance());
        System.out.println("Enter amount you want to withdraw:");
        accNew.debit(sc.nextDouble());
        System.out.println("Current Balance of Account: "+accNew.getBalance());
        sc.close();
    }
}