package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Inserting_Records
{
    public static void main(String[] args)
    {

        try
        {
            String id,name;
            Scanner s=new Scanner(System.in);
            int age;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_Java", "root", "2003");
            Statement stat = conn.createStatement();
            System.out.print("Enter ID:");
            id=s.nextLine();
            System.out.print("Enter Name:");
            name=s.nextLine();
            System.out.print("Enter Age:");
            age=s.nextInt();
            stat.executeUpdate("INSERT INTO Student(ID,NAME,AGE) VALUES('"+id+"','"+name+"',"+age+");");
            System.out.println("Record Inserted");
        }
        catch(Exception e)
        {
            System.out.println("Error :"+e);
        }
    }
}
