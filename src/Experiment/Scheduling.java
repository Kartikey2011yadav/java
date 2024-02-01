package Experiment;

import java.util.Scanner;

class Scheduling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] diff = new int[size];
        for(int i=0; i<size; i++){
            diff[i] = sc.nextInt();
        }
        int days = sc.nextInt();
        if(days > size){
            System.out.println("-1");
        }
        else{
            int temp = diff[0];
            for(int i= 1; i<size-days+1; i++){
                if(diff[i] > temp){
                    temp = diff[i];
                }
            }
            int sum = temp;
            for(int i=size-days+1; i<size; i++){
                sum += diff[i];
            }
            System.out.println(sum);
        }
    }
}
