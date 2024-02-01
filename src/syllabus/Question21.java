package syllabus;

import java.util.Scanner;

public class Question21 {
    int[] BubbleSort(int[] arr){
        int temp = 0;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length for array:");
        int l = sc.nextInt();
        int[] array = new int[l];
        for(int i = 0; i< l; i++){
            System.out.print("Enter Element "+i +":");
            array[i] = sc.nextInt();
        }
        Question21 q = new Question21();
        int[] res = q.BubbleSort(array);
        for(int ele : res){
            System.out.print(ele+ " ");
        }
    }
}
