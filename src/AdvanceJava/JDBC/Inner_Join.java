package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Inner_Join
{
    public static void main(String[] args)
    {
        try
        {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava","root","Kartikey2011");
            Statement stat=conn.createStatement();
            String query="select * from Student as s inner join Course as c where s.ID=c.ID;";
            ResultSet res=stat.executeQuery(query);
            while (res.next())
            {
                System.out.println("Id:"+res.getString("ID")+"  Name:"+res.getString("NAME")+"  Interest:"+
                        res.getString("INTEREST")+"  Course:"+res.getString("Title"));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
