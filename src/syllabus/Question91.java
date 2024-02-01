package syllabus;

import java.io.File;
public class  Question91{
    public static void main(String[] args) {
        try {
            File file = new File("src/syllabus/file.txt");
            if(file.exists()){
                System.out.println("File already exist");
            }else{
                System.out.println("File doesn't exist!!!");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
