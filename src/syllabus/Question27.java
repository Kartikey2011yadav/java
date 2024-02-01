package syllabus;

public class Question27 {
    void fun(int ... a){
        System.out.println(a.length);
        System.out.println("Elements parsed are as follows: ");
        for(int ele: a){
            System.out.print(ele+" ");
        }
    }
    public static void main(String []args){
        Question27 v = new Question27();
        v.fun(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
}
