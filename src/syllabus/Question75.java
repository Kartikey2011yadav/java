package syllabus;

public class Question75 {
    public static void two() throws Exception {
        throw new Exception("thrown from two() method");
    }
    public static void one() throws Throwable {
        two();
    }
    public static void main(String[] args) throws Throwable {
        try {
            one();
        } catch(Exception e) {
            System.out.println("Exception Caught"+e);
        }
    }
}
