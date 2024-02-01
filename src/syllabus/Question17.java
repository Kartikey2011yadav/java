package syllabus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question17 {
    int fibonacci(int num){
        if(num > 1){
            return fibonacci(num-1) + fibonacci(num-2);
        }
        else  return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> fiboSeries = new ArrayList<>();
        System.out.print("Enter number of iterations: ");
        int n = sc.nextInt();
        Question17 fibo = new Question17();
        for (int i = 0; i < n; i++) {
            fiboSeries.add(fibo.fibonacci(i));
        }
        System.out.println("Fibonacci Series: "+fiboSeries);
    }
}
