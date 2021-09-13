package belajar.java.mysql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


// bisa juga diimpor sekaligus seperti ini:
// import java.sql.*


public class BelajarMysql{
      static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
      static final String DB_URL = "jdbc:mysql://localhost/db_perpustakaan";
      static final String USER = "wildan";
      static final String PASS = "wildan123";

      static Connection conn;
      static Statement stmt;
      static ResultSet rs;

      public static void main(String[] args) {
          try {
              Class.forName(JDBC_DRIVER);
              conn = DriverManager.getConnection(DB_URL, USER, PASS);
              stmt = conn.createStatement();
              String sql = "SELECT * FROM buku";
              rs = stmt.executeQuery(sql);

              while (rs.next()) {
                  System.out.println();
                  System.out.println("-------------------------------------");
                  System.out.println("ID Buku :"+rs.getInt("id_buku"));
                  System.out.println("Judul  :"+rs.getString("judul"));
                  System.out.println("Pengarang :"+rs.getString("pengarang"));
              }

              stmt.close();
              conn.close();
          } catch (Exception e) {
            e.printStackTrace();
        }
      }

}