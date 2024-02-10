package AdvanceJava.JDBC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;

public class Image_Insert
{
    public static void main(String[] args)
    {
        Connection conn=null;
        try
        {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava","root","Kartikey2011");

            String create_table_query="create table if not exists img_table(id int primary key,image mediumblob);";
            Statement tab_statement=conn.createStatement();
            tab_statement.executeUpdate(create_table_query);

            String query="insert into img_table values(?,?);";
            PreparedStatement stat= conn.prepareStatement(query);

//            JFileChooser jfile=new JFileChooser();
//            jfile.showOpenDialog(null);
//            File file=jfile.getSelectedFile();
            File file = new File("/home/darth-kartikey/Downloads/me.jpeg");
            FileInputStream filestream=new FileInputStream(file);

            stat.setInt(1,1);
            stat.setBinaryStream(2,filestream,filestream.available());
            stat.executeUpdate();
            System.out.println("Image Inserted Succesfully");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
