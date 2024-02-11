package AdvanceJava.JDBC;

import java.sql.*;
import java.util.Scanner;

public class All_in_One
{
    static void insert(Statement s,String id,String name,String inter)
    {
        try
        {
            s.executeUpdate("INSERT INTO Student(ID,NAME,INTEREST) VALUES('"+id+"','"+name+"','"+inter+"');");
            System.out.println("Record Inserted");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    static void delete(Statement s,String id)
    {
        try
        {

            String query="delete from Student where ID='"+id+"';";
            s.executeUpdate(query);
            System.out.println("Record ID "+ id+" Deleted Successfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    static void display(Statement s)
    {
        try
        {

            ResultSet res= s.executeQuery("Select * from Student;");
            while(res.next())
            {
                System.out.println("ID:"+res.getString("ID")+"   Name:"+res.getString("NAME")+"   Age:"+res.getString("INTEREST"));
            }
        }
        catch (SQLException e)
        {
            System.out.println("Exception:"+e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        String id1;
        try
        {
            Scanner s=new Scanner(System.in);
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava","root","Kartikey2011");
            Statement stat=conn.createStatement();

            while(true)
            {
                System.out.print("1.Insert  |  ");
                System.out.print("2.Delete  |  ");
                System.out.print("3.Display  |  ");
                System.out.print("4.Exit \n");
                System.out.print("Enter your Choice:");
                Integer choice=s.nextInt();
                if(choice==1)
                {
                    s.nextLine();
                    System.out.print("Enter ID:");
                    id1=s.nextLine();

                    System.out.print("Enter Name:");
                    String name=s.nextLine();
                    System.out.print("Enter Interest:");
                    String inter=s.nextLine();
                    insert(stat,id1,name,inter);
                }
                else if (choice==2)
                {
                    s.nextLine();
                    System.out.print("Enter ID to be Deleted:");
                    id1=s.nextLine();
                    delete(stat,id1);
                }
                else if(choice==3)
                {
                    display(stat);
                }
                else
                {
                    break;
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
