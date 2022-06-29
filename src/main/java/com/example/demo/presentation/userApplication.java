package com.example.demo.presentation;

//import com.example.demo.data.databaseInfo;
//import com.example.demo.data.databaseQuery;

import com.example.demo.data.databaseInfo;
import com.example.demo.data.databaseQuery;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;

@Path("/gebruikersApplicatie")
public class userApplication {

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getProgrammeurs(){
//        JsonArrayBuilder builder = Json.createArrayBuilder();
//        builder.add("werkt de gebruikerApp?");
//
//        return builder.build().toString();
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String allUsers() throws SQLException {
        JsonArrayBuilder builder = Json.createArrayBuilder();
        try{
            databaseQuery.setDBConnection();
            ArrayList<String> users = databaseInfo.getUsers();
            for(String user : users){
                builder.add(user);
            }
            databaseQuery.closeDBConnection();
            return builder.build().toString();

        }catch(Exception e){
            return e.getMessage();
        }
    }

    @POST
    @Path("/{voornaam}/{achternaam}/{wachtwoord}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createNewUserProfile(@PathParam("voornaam") String voornaam,
                                         @PathParam("achternaam") String achternaam,
                                         @PathParam("wachtwoord") String wachtwoord){
        try{
            databaseQuery.setDBConnection();

            Response response = databaseInfo.createNewUserProfile(voornaam, achternaam, wachtwoord );

            databaseQuery.closeDBConnection();

            return response;

        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }
    }
//
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    public void userLogIn(String voornaam, String wachtwoord){
//        try{
//            databaseQuery.setDBConnection();
//
//            ArrayList<String> users = databaseInfo.getUsers();
//            for(String user : users){
//                if(user.contains(voornaam) && user.contains(wachtwoord)){
//
//                }
//            }
//
//            databaseQuery.closeDBConnection();
//
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
}