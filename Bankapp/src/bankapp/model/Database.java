package bankapp.model;

import java.sql.*;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/bankdb";
    private static final String USER = "root";     // ใส่ username ของ MySQL
    private static final String PASS = "";         // ใส่ password ของ MySQL

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
