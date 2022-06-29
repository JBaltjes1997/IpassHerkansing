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
////            ArrayList<String> gebruikers = new ArrayList<>();
//            Connection connection = databaseQuery.getDBConnection();
//            if(connection != null){
//                System.out.println("connection succesfull");
//            }
////            Statement statement = connection.createStatement();
////            ResultSet resultSet = statement.executeQuery("SELECT voornaam FROM gebruiker");
////
////            while(resultSet.next()) {
////                gebruikers.add(resultSet.getString(1));
////            }
////            System.out.println(gebruikers);
//
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
////        SpringApplication.run(Ipass2HerkansingApplication.class, args);
    }
}
