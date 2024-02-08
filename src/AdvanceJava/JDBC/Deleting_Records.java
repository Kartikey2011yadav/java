package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Deleting_Records
{
    public static void main(String[] args)
    {
        try
        {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_Java","root","2003");
            Statement stat=conn.createStatement();
            Scanner s=new Scanner(System.in);
            System.out.print("Enter ID to be Deleted:");
            String id=s.nextLine();
            String query="delete from Student where ID='"+id+"';";
            stat.executeUpdate(query);
            System.out.println("Record ID "+ id+" Deleted Successfully");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}
