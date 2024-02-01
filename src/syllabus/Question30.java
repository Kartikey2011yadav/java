package syllabus;

import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String Str1 = sc.next();
        System.out.print("Enter 2nd String: ");
        String Str2 = sc.next();
        System.out.print("Enter 3rd String: ");
        String Str3 = sc.next();
        if (Str1.equals(Str2)){
            System.out.println("String 1 and 2 matches");
        }
        else {
            System.out.println("String 1 and 2 doesn't matches");
        }
        if (Str1.equalsIgnoreCase(Str3)){
            System.out.println("String 1 and 2 matches");
        }
        else {
            System.out.println("String 1 and 2 doesn't matches");
        }
    }
}
