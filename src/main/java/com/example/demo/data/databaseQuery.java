package com.example.demo.data;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class databaseQuery {
    private static String jdbcURL = "jdbc:postgresql://localhost:5433/IPASS";
    private static String username = "postgres";
    private static String password = "T1mmyD3Kat";
    private static Connection connection;

    public static void setDBConnection() throws SQLException {
        databaseQuery.connection = getConnection(jdbcURL, username, password );
    }

    public static Connection getDBConnection() {
        return connection;
    }

    public static void closeDBConnection() throws SQLException {
        connection.close();
    }
}
