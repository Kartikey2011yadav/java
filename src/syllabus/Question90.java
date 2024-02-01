package syllabus;

import java.io.File;
public class Question90
{
    public static void main(String[] args)
    {
        try
        {
            File f= new File("src/syllabus/file.txt");
            if(f.delete())
            {
                System.out.println(f.getName() + " successfully deleted");
            }
            else
            {
                System.out.println("failed to delete");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

