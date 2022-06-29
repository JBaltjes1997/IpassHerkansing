package com.example.demo.data;

import com.example.demo.domain.User;

import javax.ws.rs.core.Response;
import java.sql.*;
import java.util.ArrayList;

public class databaseInfo {

    public static Response createNewUserProfile(int id, String voornaam, String achternaam, String wachtwoord )
            throws SQLException, ClassNotFoundException {

//        Class.forName("org.postgresql.Driver");
        Connection connection = databaseQuery.getDBConnection();
//        java.sql.Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/IpassHerkansing", "postgres", "T1mmyD3Kat");
        Statement statement = connection.createStatement();

        try {
            statement.execute("INSERT INTO gebruiker(id, voornaam, achternaam, wachtwoord ) values ('"+id+"', '"
                    +voornaam+"', '" +achternaam+"', '" +wachtwoord+"')");
            return Response.ok().build();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }
    }

//    public static ArrayList<String> getUsers() throws SQLException {
//        ArrayList<String> gebruikers = new ArrayList<>();
//
//        Connection connection = databaseQuery.getDBConnection();
//        Statement statement = connection.createStatement();
//
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM gebruiker");
//
//        while(resultSet.next()){
//            gebruikers.add(resultSet.getString(2));
//            gebruikers.add(resultSet.getString(3));
//            gebruikers.add(resultSet.getString(11));
//        }
//        return gebruikers;
//    }

    public static ArrayList<String> getUsers() throws SQLException {
        ArrayList<String> gebruikers = new ArrayList<>();

        Connection connection = databaseQuery.getDBConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT voornaam FROM gebruiker");

        while(resultSet.next()){
            gebruikers.add(resultSet.getString(1));
//            gebruikers.add(resultSet.getString(3));
//            gebruikers.add(resultSet.getString(11));
        }
        return gebruikers;
    }

    public static ArrayList<String> getRequests() throws SQLException, ClassNotFoundException {

//        Class.forName("org.postgresql.Driver");
        Connection connection = databaseQuery.getDBConnection();
//        java.sql.Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/IpassHerkansing", "postgres", "T1mmyD3Kat");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM hulpvraag");
        ArrayList<String> hulpvragen = new ArrayList<>();
        while(resultSet.next()){
            hulpvragen.add(resultSet.getString(1));
            hulpvragen.add(resultSet.getString(2));
            hulpvragen.add(resultSet.getString(3));
        }
        return hulpvragen;
    }

//    public static Response createNewRequest(String username, String wachtwoord) throws SQLException {
//
//        Connection connection = databaseQuery.getDBConnection();
//        Statement statement = connection.createStatement();
//
//        try {
//            statement.execute("INSERT INTO hulpvraag(naam, wachtwoord) values ('"+username+"', '" +wachtwoord+"')");
//            return Response.ok().build();
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//            return Response.status(405).build();
//        }
//    }
}
