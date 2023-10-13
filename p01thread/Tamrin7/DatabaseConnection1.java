package org.example.thread.p01thread.Tamrin7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection1 {
    private Connection connection;
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String userName = "postgres";
    private static final String passWord = "123qweR";

    public DatabaseConnection1() {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                connection = DriverManager.getConnection(url,userName,passWord);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
