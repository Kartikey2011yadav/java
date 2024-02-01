package syllabus;

import java.util.Arrays;
public class Question67 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            for (int i = 0; i <= 5; i++){
                arr[i] = i+1;
            }
            System.out.println(Arrays.toString(arr));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error Caught: "+e);
        }
        catch (Exception e){
            System.out.println("Error Caught: "+e);
        }
    }
}
