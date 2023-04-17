/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.*;

/**
 *
 * @author ridhogymnastiar
 */
public class Database {

    private static Connection conn;

    public static void main(String[] args) {
        new Database().koneksiDatabase();
    }

    public void koneksiDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/tester_db";
            String user = "root";
            String pass = "";

            conn = DriverManager.getConnection(url, user, pass);
            // System.out.println("Koneksi berhasil!");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("koneksi gagal" + e.getMessage());
        }
    }

    public Connection getKoneksi() {
        return conn;
    }
}
