package syllabus;

import java.io.File;
import java.io.IOException;
public class Question89
{
    public static void main(String[] args)
    {
        File file = new File("src/syllabus/file.txt");
        boolean result;
        try
        {
            result = file.createNewFile();
            if(result)
            {
                System.out.println("file created "+file.getCanonicalPath());
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception Caught"+e);
        }
    }
}
