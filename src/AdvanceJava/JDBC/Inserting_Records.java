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
            String id,name,interest;
            Scanner s=new Scanner(System.in);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava", "root", "Kartikey2011");
            Statement stat = conn.createStatement();
            System.out.print("Enter ID: ");
            id=s.nextLine();
            System.out.print("Enter Name: ");
            name=s.nextLine();
            System.out.print("Enter Interests: ");
            interest=s.nextLine();
//            stat.executeUpdate("INSERT INTO Course(ID,Title) VALUES('"+id+"','"+name+"');");
            stat.executeUpdate("INSERT INTO Student(ID,NAME,INTEREST) VALUES('"+id+"','"+name+"','"+interest+"');");
            System.out.println("Record Inserted");
        }
        catch(Exception e)
        {
            System.out.println("Error :"+e);
        }
    }
}
