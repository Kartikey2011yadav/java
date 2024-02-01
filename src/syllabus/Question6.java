package syllabus;

public class Question6 {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <16 ; i++) {
            if(i % 2 == 1){
                product *= i;
            }
        }
        System.out.println("Product of first 15 odd Numbers: "+ product);
    }
}
