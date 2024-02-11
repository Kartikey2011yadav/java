package AdvanceJava.JDBC;

import java.sql.*;
import java.util.Scanner;

public class All_in_One_
{
    static void insert(Statement s,String id,String name,int age)
    {
        try
        {
            s.executeUpdate("INSERT INTO Student(ID,NAME,AGE) VALUES('"+id+"','"+name+"',"+age+");");
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
                System.out.println("ID:"+res.getString("ID")+"   Name:"+res.getString("NAME")+"   Age:"+res.getInt("AGE"));
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
                System.out.println("1.Insert");
                System.out.println("2.Delete");
                System.out.println("3.Display");
                System.out.println("4.Exit");
                System.out.print("Enter your Choice:");
                Integer choice=s.nextInt();
                if(choice==1)
                {
                    s.nextLine();
                    System.out.print("Enter ID:");
                    id1=s.nextLine();

                    System.out.print("Enter Name:");
                    String name=s.nextLine();
                    System.out.print("Enter Age:");
                    int age=s.nextInt();
                    insert(stat,id1,name,age);
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
