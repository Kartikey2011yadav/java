package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteImage {
    public static void main(String[] args)
    {
        try
        {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava","root","Kartikey2011");
            Statement stat=conn.createStatement();
            Scanner s=new Scanner(System.in);
            System.out.print("Enter ID of Image to be Deleted:");
            int id=s.nextInt();
            String query="delete from img_table where id='"+id+"';";
            stat.executeUpdate(query);
            System.out.println("Image ID "+ id+" Deleted Successfully");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}
