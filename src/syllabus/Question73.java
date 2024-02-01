package syllabus;

public class Question73 {
    String str;
    Question73(String s) throws Exception {
        throw new Exception(s);
    }
    public static void main(String[] args) {
        try {
            Question73 q = new Question73("Exception is generated");
        } catch (Exception err) {
            System.out.println("Exception is caught");
            System.out.println("Exception is" + err);
        } finally {
            System.out.println("Final Block");
        }
    }
}
