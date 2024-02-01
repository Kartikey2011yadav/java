package syllabus;

public class Question68 {
    public static void main(String[] args) {
        String str = null;
        try{
            if(str.equals("hello there")){
                System.out.println("it's a greeting.");
            }
            else {
                System.out.println("not a greeting.");
            }
        }
        catch (NullPointerException e){
            System.out.println("Exception Caught: "+e);
        }
        catch (Exception e){
            System.out.println("Exception Caught: "+e);
        }
    }
}
