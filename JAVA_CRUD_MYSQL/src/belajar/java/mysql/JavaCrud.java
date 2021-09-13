package belajar.java.mysql;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class JavaCrud {

  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/db_perpustakaan";
  static final String USER = "wildan";
  static final String PASS = "wildan123";

  static Connection conn;
  static Statement stmt;
  static ResultSet rs;
  static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
  static BufferedReader input = new BufferedReader(inputStreamReader);

  public static void main(String[] args) {
    try {
      Class.forName(JDBC_DRIVER);

      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();

      while (!conn.isClosed()) {
        showMenu();
      }

      stmt.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void showMenu() {
    System.out.println("\n------Menu Utama-------");
    System.out.println("1. tambah Data");
    System.out.println("2. Show Data");
    System.out.println("3. Edit Data");
    System.out.println("4. Delete Data");
    System.out.println("0. Keluar");
    System.out.println("");
    System.out.print("PILIHAN> ");

    try {
      int pilihan = Integer.parseInt(input.readLine());

      switch (pilihan) {
        case 0:
          System.exit(0);
          break;
        case 1:
          insertBuku();
          break;
        case 2:
          showData();
          break;
        case 3:
          updateBuku();
          break;
        case 4:
          deleteBuku();
          break;
        default:
          System.out.println("Pilihan salah!");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void insertBuku() {
    try {
      // ambil input dari user
      System.out.print("id buku : ");
      String id_buku = input.readLine().trim();
      System.out.print("judul : ");
      String judul = input.readLine().trim();
      System.out.print("Pengarang : ");
      String pengarang = input.readLine().trim();

      //   query simpan
      String sql =
        "INSERT INTO buku (id_buku,judul,pengarang) VALUES ('%s','%s','%s')";
      sql = String.format(sql, id_buku, judul, pengarang);

      //   simpan buku
      stmt.execute(sql);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void showData() {
    String sql = "SELECT * FROM buku";

    try {
      rs = stmt.executeQuery(sql);

      System.out.println("+--------------------------------+");
      System.out.println("|    DATA BUKU DI PERPUSTAKAAN   |");
      System.out.println("+--------------------------------+");

      while (rs.next()) {
        String idBuku = rs.getString("id_buku");
        String judul = rs.getString("judul");
        String pengarang = rs.getString("pengarang");

        System.out.println(
          String.format("%s. %s -- (%s)", idBuku, judul, pengarang)
        );
      }
      System.in.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void updateBuku() {
    try {
      System.out.print("ID yang mau diedit : ");
      String idBuku = input.readLine().trim();
      System.out.print("judul :");
      String judul = input.readLine().trim();
      System.out.print("pengarang :");
      String pengarang = input.readLine().trim();

      //   query update
      String sql =
        "UPDATE buku SET judul = '%s',pengarang='%s' WHERE id_buku='%s'";
      sql = String.format(sql, judul, pengarang, idBuku);
      // update data buku
      stmt.execute(sql);

      System.in.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void deleteBuku() {
    try {
      //   ambil data user
      System.out.print("ID yang mau dihapus :");
      String idBuku = input.readLine().trim();

      // buat query
      String sql = String.format(
        "DELETE FROM buku WHERE  id_buku='%s'",
        idBuku
      );

      stmt.execute(sql);

      System.out.println("data sudah dihapus");

      System.in.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
