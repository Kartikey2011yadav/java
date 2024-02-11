package AdvanceJava.JDBC;

import java.sql.*;

public class Displaying_Data
{
    public static void main(String[] args)
    {
        Connection conn=null;
        try
        {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava","root","Kartikey2011");
            Statement statement= conn.createStatement();
            ResultSet res= statement.executeQuery("Select * from Student;");
            while(res.next())
            {
                System.out.println("ID:"+res.getString("ID")+"   Name:"+res.getString("NAME")+"   Interest:"+res.getString("INTEREST"));
            }
        }
        catch (SQLException e)
        {
            System.out.println("Exception:"+e.getMessage());
        }

    }
}
