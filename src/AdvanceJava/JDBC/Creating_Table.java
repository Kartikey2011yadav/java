package AdvanceJava.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Creating_Table
{
    public static void main(String [] args)
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_Java", "root", "2003");
            Statement stat = conn.createStatement();
            stat.executeUpdate("CREATE TABLE IF NOT EXISTS Student(ID VARCHAR(10),NAME VARCHAR(20),AGE INT)");
            System.out.println("Table Created");
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }
}
