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
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_Java","root","2003");
            Statement stat= conn.createStatement();
            stat.executeUpdate("alter table Student drop column Marks");
            System.out.println("Added collum Succesfully");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
