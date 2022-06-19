package com.example.demo.data;

import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseInfo {

    public static Response createNewUserProfile(int id, String voornaam, String achternaam, String adres,
                                                String postcode, String woonplaats, Date geboortedatum,
                                                int telefoonnummer, String mailadres, String wachtwoord )
                                                throws SQLException {

        Connection connection = databaseQuery.getDBConnection();
        Statement statement = connection.createStatement();

        try {
            statement.execute("INSERT INTO gebruiker(id, voornaam, achternaam, adres, postcode, woonplaats, \n" +
                    "                    geboortedatum, telefoonnummer, mailadres, wachtwoord ) values ('"+id+"', '"
                    +voornaam+"', '" +achternaam+"', '" +adres+"', '" +postcode+"', '" +woonplaats+"', " +
                    "'" +geboortedatum+"', '" +telefoonnummer+"', '" +mailadres+"', '" +wachtwoord+"')");
            return Response.ok().build();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }
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
