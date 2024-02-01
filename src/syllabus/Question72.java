package syllabus;

public class Question72 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            for (int i = 0; i <= 5; i++){
                arr[i] = i+1;
            }
        }
        catch (Exception e){
            System.out.println("Error Caught: "+e);

        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Error Caught: "+e);
//        }
    }
}
