package com.example.demo.data;

import com.example.demo.domain.Supplier;
import com.example.demo.domain.User;

import javax.ws.rs.core.Response;
import java.sql.*;
import java.util.ArrayList;

public class databaseInfo {

    public static Response createNewUserProfile(String voornaam, String achternaam, String wachtwoord)
            throws SQLException, ClassNotFoundException {

        Connection connection = databaseQuery.getDBConnection();
        Statement statement = connection.createStatement();

        try {
            statement.execute("INSERT INTO gebruiker(id, voornaam, achternaam, wachtwoord ) values (nextval('gebruiker_id_seq'), '"
                    +voornaam+"', '" +achternaam+"', '" +wachtwoord+"')");
            return Response.ok().build();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }
    }

    public static Response updateUserProfile(String hvoornaam, String Nvoornaam, String achternaam, String wachtwoord) throws SQLException{
        Connection connection = databaseQuery.getDBConnection();
        Statement statement = connection.createStatement();

        try {
            statement.execute("update gebruiker set voornaam = '" +Nvoornaam+ "', achternaam = '" +achternaam+ "' , wachtwoord = '" +wachtwoord+ "' where voornaam = '" +hvoornaam+ "';");
//            statement.execute("update gebruiker\n" +
//                    "set voornaam = '"+Nvoornaam+"', achternaam = '"+achternaam+"', wachtwoord = '"+wachtwoord+"'\n" +
//                    "where gebruiker.voornaam = '"+hvoornaam+"';");
            return Response.ok().build();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }
    }

    public static Response createNewSupplierProfile(String voornaam, String achternaam, String specialisme, String wachtwoord )
            throws SQLException, ClassNotFoundException {

        Connection connection = databaseQuery.getDBConnection();
        Statement statement = connection.createStatement();

        try {
            statement.execute("INSERT INTO aanbieder(id, voornaam, achternaam, specialisme, wachtwoord ) values (nextval('aanbieder_id_seq'), '"
                    +voornaam+"', '" +achternaam+"', '" +specialisme +"' , '" +wachtwoord+"')");
            return Response.ok().build();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }
    }

    public static User getUserInfo(String wachtwoord) throws SQLException {
        Connection connection = databaseQuery.getDBConnection();
        Statement statement = connection.createStatement();

//        String query = String.format("SELECT * FROM gebruiker where gebruiker.wachtwoord = %s", wachtwoord);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM gebruiker where gebruiker.wachtwoord = '" +wachtwoord+"'");

        User dezeUser = new User();
        while(resultSet.next()){
            dezeUser.setId(resultSet.getInt(1));
            dezeUser.setFirstName(resultSet.getString(2));
            dezeUser.setLastName(resultSet.getString(3));
            dezeUser.setPassword(resultSet.getString(11));
        }
        return dezeUser;
    }

    public static ArrayList<User> getUsers() throws SQLException {
        ArrayList<User> gebruikers = new ArrayList<>();

        Connection connection = databaseQuery.getDBConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM gebruiker");

        while(resultSet.next()){
            User dezeUser = new User();
            dezeUser.setId(resultSet.getInt(1));
            dezeUser.setFirstName(resultSet.getString(2));
            dezeUser.setLastName(resultSet.getString(3));
            dezeUser.setPassword(resultSet.getString(11));
            gebruikers.add(dezeUser);
        }
        return gebruikers;
    }

    public static ArrayList<Supplier> getSuppliers() throws SQLException {
        ArrayList<Supplier> aanbieders = new ArrayList<>();

        Connection connection = databaseQuery.getDBConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM aanbieder");

        while(resultSet.next()){
            Supplier dezeSupplier = new Supplier();
            dezeSupplier.setId(resultSet.getInt(1));
            dezeSupplier.setFirstName(resultSet.getString(2));
            dezeSupplier.setLastName(resultSet.getString(3));
            dezeSupplier.setPassword(resultSet.getString(11));
            dezeSupplier.setSpecialty(resultSet.getString(9));
            aanbieders.add(dezeSupplier);
        }
        return aanbieders;
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

    public static void deleteUserProfile(int id) throws SQLException{
        Connection connection = databaseQuery.getDBConnection();
        Statement statement = connection.createStatement();
        String query = String.format("delete from gebruiker where gebruiker.id = %d", id);

        statement.executeQuery(query);
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
