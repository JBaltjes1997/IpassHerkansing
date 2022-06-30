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
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
//        String jdbcURL = "jdbc:postgresql://localhost:5433/IpassHerkansing";
//        String username = "postgres";
//        String password = "T1mmyD3Kat";
        String jdbcURL = "jdbc:postgres://cqqsytyunzsftj:7cdd55345624db304d413948081dadae66cab2c05caa6023c45c206c3127689c@ec2-63-34-180-86.eu-west-1.compute.amazonaws.com:5432/d3en7dhurf5e78";
        String username = "cqqsytyunzsftj";
        String password = "7cdd55345624db304d413948081dadae66cab2c05caa6023c45c206c3127689c";
        databaseQuery.connection = getConnection(jdbcURL, username, password);
    }

    public static Connection getDBConnection() {
        return connection;
    }

    public static void closeDBConnection() throws SQLException {
        connection.close();
    }
}
