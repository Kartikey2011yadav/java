package AdvanceJava.JDBC;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.sql.*;

public class Image_Display
{
    public static void main(String[] args)
    {
        try
        {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_Java","root","2003");
            Statement stat=conn.createStatement();
            ResultSet res= stat.executeQuery("select * from img_table;");
            if(res.next())
            {
                Blob blb=res.getBlob("image");
                InputStream in = blb.getBinaryStream();
                BufferedImage image = ImageIO.read(in);
                File outputFile = new File("output.png");
                ImageIO.write(image, "png", outputFile);
                Desktop dt = Desktop.getDesktop();
                dt.open(outputFile);
                System.out.println("Image Created");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
