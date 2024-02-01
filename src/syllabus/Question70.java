package syllabus;

public class Question70 {
    public static void main(String[] args) {
        try{
            Class.forName("syllabus.Account_");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Exception caught: "+e);
        }
    }
}
