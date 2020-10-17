package com.sammidev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sammidev
 */
public class KoneksiDatabase {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                String url      = "jdbc:postgresql://localhost:5432/simpleappDB";
                String user     = "postgres";
                String password = "sammidev";
                
                koneksi = DriverManager.getConnection(url,user,password);
                System.out.println("connected");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        return koneksi;
    }
}
