/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectLastTerm;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 84935
 */
public class C1 {
 public static void main(String[] args) {
  try {
            // Đăng ký driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // URL kết nối với thuộc tính encrypt và trustServerCertificate
            String dbURL = "jdbc:sqlserver://MSI;databaseName=Data;user=sa;password=12345;encrypt=true;trustServerCertificate=true";

            // Tạo kết nối
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
      System.out.println("Connected success");
      DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
      System.out.println("Driver name: " + dm.getDriverName());
      System.out.println("Driver version: " + dm.getDriverVersion());
      System.out.println("Product name: " + dm.getDatabaseProductName());
      System.out.println("Product version: " + dm.getDatabaseProductVersion());
    }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
            
        }
  }
}

