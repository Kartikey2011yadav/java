package syllabus;

import java.io.*;
public class Question71 {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("src/syllabus/fil.txt");

            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println("Exception caught: "+e);
        }
    }
}

