package com.example.demo.data;

import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseInfo {

    public static Response createNewUserProfile(int id, String voornaam, String achternaam, String wachtwoord )
                                                throws SQLException {

        Connection connection = databaseQuery.getDBConnection();
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
