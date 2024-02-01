package AdvanceJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Kartikey2011");
            System.out.println(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
