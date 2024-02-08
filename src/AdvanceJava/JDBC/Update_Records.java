package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Records
{
    public static void main(String []args)
    {
        Connection conn=null;
        try
        {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_Java","root","2003");
            Statement stat=conn.createStatement();
            stat.executeUpdate("UPDATE Student set NAME='Soham' where ID='S005';");
            System.out.println("Record Updated");
        }
        catch (SQLException e)
        {
            System.out.println("Exception:"+e);
        }
    }
}