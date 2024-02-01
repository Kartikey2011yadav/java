package syllabus;

public class Question24 {
    void display(int[] arr){
        System.out.print("[");
        for(int ele: arr){
            System.out.print(ele+", ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        Question24 dis = new Question24();
        dis.display(new int[]{1,2,3,4,5,6,7});
    }
}
