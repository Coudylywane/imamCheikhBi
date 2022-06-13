package com.allocation.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    private static String user = "root";
    private static String password = "";
    private static String url = "jdbc:mysql://localhost:3306/demo";

    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("connected sucessfully");
            } else {
                System.out.println("Failed to connect to database");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}
