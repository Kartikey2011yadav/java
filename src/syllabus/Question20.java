package syllabus;

import java.util.Scanner;

public class Question20 {
    int[] SelectionSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[minIndex]> arr[j]){
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
        Question20 q = new Question20();
        int[] res = q.SelectionSort(array);
        for(int ele : res){
            System.out.print(ele+ " ");
        }
    }
}
