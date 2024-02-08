package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity
{
    public static void main(String[] args)
    {
        Connection conn=null;
        try
        {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_Java","root","2003");
            if(conn!=null)
            {
                System.out.println("Mysql Connected Successfully");
            }
            else
            {
                System.out.println("Connection Failed");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
