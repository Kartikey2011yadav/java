package AdvanceJava.JDBC;

import java.sql.*;
import java.util.Scanner;

public class Prepared_Statements
{
    public static void main(String[] args)
    {
        Connection conn=null;
        String id,name;
        Scanner s=new Scanner(System.in);
        String inter;
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava","root","Kartikey2011");
            String query="insert into Student values(?,?,?);";
            PreparedStatement stat= conn.prepareStatement(query);
            System.out.print("Enter ID:");
            id=s.nextLine();
            System.out.print("Enter Name:");
            name=s.nextLine();
            System.out.print("Enter Interest:");
            inter=s.nextLine();
            stat.setString(1,id);
            stat.setString(2,name);
            stat.setString(3,inter);
            stat.executeUpdate();
            System.out.println("Data Inserted Successfully");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
