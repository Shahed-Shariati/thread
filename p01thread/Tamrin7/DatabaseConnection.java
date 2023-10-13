package org.example.thread.p01thread.Tamrin7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    private   Connection connection;
    private static DatabaseConnection instance;
    private static final String url = "jdbc:postgresql://localhost:5432/onlineshop";
    private static final String userName = "postgres";
    private static final String passWord = "123qweR";
    private static PreparedStatement preparedStatement;
    private DatabaseConnection() {
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,userName,passWord);
        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
    }

    public static DatabaseConnection getInstance()
    {
        try {
            if(instance == null){
                return  instance = new DatabaseConnection();
            }else if(instance.getConnection().isClosed()) {
                return instance = new DatabaseConnection();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return instance;
    }

    public  Connection getConnection() {
        return connection;
    }
}
