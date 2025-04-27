package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/20220305070";
    private static final String USER = "root";    
    private static final String PASSWORD = "";    

    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Veritabanına başarıyla bağlanıldı!");
            return conn;
        } catch (Exception e) {
            System.out.println("Bağlantı hatası:");
            e.printStackTrace();
            return null;
        }
    }
}
