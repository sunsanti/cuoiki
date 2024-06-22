/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuoiKi2;
import java.sql.*;

public class MyConnection {
    public static Connection getConnection(){
        try {
            // Đăng ký driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // URL kết nối với thuộc tính encrypt và trustServerCertificate
            String dbURL = "jdbc:sqlserver://MSI;databaseName=Data;user=sa;password=12345;encrypt=true;trustServerCertificate=true";

            // Tạo kết nối
            Connection conn = DriverManager.getConnection(dbURL);
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
            return null;
        }
    }
}
