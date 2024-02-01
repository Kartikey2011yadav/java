package syllabus;

import java.util.Scanner;
public class Question69 {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            num = Integer.parseInt(sc.next());
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
