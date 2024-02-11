package AdvanceJava.JDBC;

import java.sql.*;

public class ConnectionTest {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Kartikey2011");
            System.out.println(conn);
            Statement statement= conn.createStatement();
            ResultSet res= statement.executeQuery("show databases;");
            System.out.println("-----------Databases----------");
            while (res.next()){
                System.out.println(res.getString("Database"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
