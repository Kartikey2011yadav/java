package syllabus;

import java.util.Objects;
import java.util.Scanner;

public class Question22 {
    int BinarySearch(int[] arr, int x){
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;
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
        System.out.print("Is the given array sorted [y/n]: ");
        String isSorted = sc.next();
        if(Objects.equals(isSorted, "n")){
            Question20 sort = new Question20();
            array = sort.SelectionSort(array);
        }
        else if(Objects.equals(isSorted, "y")){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Wrong input!!!");
            System.exit(0);
        }
        System.out.print("Enter a Number you want to search: ");
        int num = sc.nextInt();
        Question22 q = new Question22();
        int res = q.BinarySearch(array ,num);
        System.out.println("Search Element found at index: "+res);
    }
}
