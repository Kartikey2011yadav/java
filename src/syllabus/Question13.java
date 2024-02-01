package syllabus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< 5; i++){
            System.out.print("Enter value "+(i+1)+" :");
            arr.add(i, sc.nextInt());
        }
        arr.stream().map(nu ->nu*10 + " ").forEach(System.out::print);
        System.out.print("\n[ ");
        for(int ele : arr){
            System.out.print(ele+", ");
        }
        System.out.print("]");
    }
}
