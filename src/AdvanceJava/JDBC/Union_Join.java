package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Union_Join {
    public static void main(String[] args)
    {
        try
        {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava","root","Kartikey2011");
            Statement stat=conn.createStatement();
            String query="select * from Student where ID = 'IT-2k21-25' union select * from Student where ID= 'IT-2k21-58';";
            ResultSet res=stat.executeQuery(query);
            while (res.next())
            {
                System.out.println("Id:"+res.getString("ID")+"  Name:"+res.getString("NAME")+"  Interest:"+
                        res.getString("INTEREST"));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
