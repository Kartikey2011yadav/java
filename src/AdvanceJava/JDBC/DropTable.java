package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DropTable {
    public static void main(String[] args) {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava", "root", "Kartikey2011");
            Statement stat = conn.createStatement();
//            stat.executeUpdate("CREATE TABLE IF NOT EXISTS Temp(ID VARCHAR(10),Title VARCHAR(20))");
            stat.executeUpdate("DROP TABLE Temp;");
            System.out.println("Table temp drop successfully");
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }
}
