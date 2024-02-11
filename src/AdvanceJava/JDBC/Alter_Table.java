package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Alter_Table
{
    public static void main(String[] args)
    {
        try
        {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava","root","Kartikey2011");
            Statement stat= conn.createStatement();
            stat.executeUpdate("alter table Student drop column Marks");
            System.out.println("From table Student, column `Marks` Dropped Successfully");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
