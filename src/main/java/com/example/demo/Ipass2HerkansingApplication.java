package com.example.demo;

//import com.example.demo.data.databaseQuery;

import com.example.demo.data.databaseQuery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Ipass2HerkansingApplication {
    public static void main(String[] args) throws SQLException {
        try {
            databaseQuery.setDBConnection();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
