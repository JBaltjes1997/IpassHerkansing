package com.example.demo.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class databaseQuery {
    private static Connection connection;

    public static void setDBConnection() throws SQLException {
        String jdbcURL = "jdbc:postgresql://localhost:5433/IpassHerkansing";
        String username = "postgres";
        String password = "T1mmyD3Kat";
        databaseQuery.connection = getConnection(jdbcURL, username, password);
    }

    public static Connection getDBConnection() {
        return connection;
    }

    public static void closeDBConnection() throws SQLException {
        connection.close();
    }
}
