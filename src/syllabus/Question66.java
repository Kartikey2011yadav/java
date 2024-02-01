package syllabus;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Question66 {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("Enter Numerator: ");
            int n = sc.nextInt();
            System.out.print("Enter Denominator: ");
            int m = sc.nextInt();
            int ans = n / m;
            System.out.println("Answer for " + n + " / " + m + " : " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Exception occure: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Exception occure: " + e);
        } catch (Exception e) {
            System.out.println("Exception occure: " + e);
        } finally {
            sc.close();
        }
    }
}
