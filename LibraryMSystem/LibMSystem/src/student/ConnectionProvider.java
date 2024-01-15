package student;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getcon() {
        try {
           // Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "123456");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
