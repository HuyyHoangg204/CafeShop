package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCutil {

    public static Connection getConnection(){
        Connection cnt = null;

        try {
//            DriverManager.registerDriver(new Driver());
           Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/BookStoreDB";
            String username = "root";
            String password = "root";
            cnt = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace(); // Hiển thị thông tin chi tiết lỗi
            System.out.println("Failed to connect to the database: " + e.getMessage());
        }
        return cnt;
    }

    public static void closeConection(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println("e");
        }
    }
}
