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
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava", "root", "Kartikey2011");
            Statement stat = conn.createStatement();
            stat.executeUpdate("CREATE TABLE IF NOT EXISTS Course(ID VARCHAR(10),Title VARCHAR(20))");
//            stat.executeUpdate("CREATE TABLE IF NOT EXISTS Student(ID VARCHAR(10),NAME VARCHAR(20),INTEREST VARCHAR(25), MARKS INT)");
            System.out.println("Table Created successfully");
//            System.out.println("-----Table Created successfully-----");
//            ResultSet res=stat.executeQuery("SHOW TABLES;");
//            while (res.next()){
//                System.out.println(res.getString("Tables_in_AdvJava"));
//            }
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }
}
