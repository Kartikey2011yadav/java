package Experiment;

public class temp {
    public static void main(String[] args) {
        int sum =0;
        int n = 1500;
        for (int i = 3; i < n ; i+=3) {
            sum += i;
        }
        for (int i = 5; i < n ; i+=5) {
            if(i%3 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
