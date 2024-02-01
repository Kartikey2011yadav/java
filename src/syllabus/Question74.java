package syllabus;

public class Question74 {
    void take()
    {
        try
        {
            throw new Excep("Hello Hello");
        }
        catch (Excep err)
        {
            System.out.println(err.getMessage());
        }
    }
    public static void main(String[] args)
    {
        Question74 obj=new Question74();
        obj.take();
    }
}
class Excep extends Exception
{
    Excep(String s)
    {
        super(s);
    }
}


