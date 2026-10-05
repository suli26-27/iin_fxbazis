package com.example.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Mariadb implements Database {

    @Override
    public Connection connect() {
        try {
            return tryConnect();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public Connection tryConnect() throws SQLException {
        String username = "fxbazis";
        String password = "titok";
        String url = "jdbc:mariadb://localhost:3306/fxbazis";
        return DriverManager.getConnection(url, username, password);
    }
    
    
}
