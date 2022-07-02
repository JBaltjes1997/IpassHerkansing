package com.example.demo.presentation;

//import com.example.demo.data.databaseInfo;
//import com.example.demo.data.databaseQuery;

import com.example.demo.data.databaseInfo;
import com.example.demo.data.databaseQuery;
import com.example.demo.domain.User;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
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

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String allUsers() throws SQLException {
//        JsonArrayBuilder builder = Json.createArrayBuilder();
//        try{
//            databaseQuery.setDBConnection();
//            ArrayList<String> users = databaseInfo.getUsers();
//            for(String user : users){
//                builder.add(user);
//            }
//            databaseQuery.closeDBConnection();
//            return builder.build().toString();
//
//        }catch(Exception e){
//            return e.getMessage();
//        }
//    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String allUsers() throws SQLException {
        JsonArrayBuilder builder = Json.createArrayBuilder();
        try{
            databaseQuery.setDBConnection();
            ArrayList<User> users = databaseInfo.getUsers();
            for(User user : users){
                JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
                objectBuilder.add("id", user.getId());
                objectBuilder.add("naam", user.getFirstName());
                objectBuilder.add("achternaam", user.getLastName());
                objectBuilder.add("wachtwoord", user.getPassword());
                builder.add(objectBuilder);
            }
            databaseQuery.closeDBConnection();
            return builder.build().toString();

        }catch(Exception e){
            return e.getMessage();
        }
    }

//    @GET
//    @Path("/{voornaam}/{wachtwoord}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String UserInfo(@PathParam("voornaam") String voornaam,
//                           @PathParam("wachtwoord") String wachtwoord) throws SQLException {
//        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
//        try{
//            databaseQuery.setDBConnection();
//            User users = databaseInfo.getUserInfo(voornaam, wachtwoord);
//
//            objectBuilder.add("id", users.getId());
//            objectBuilder.add("naam", users.getFirstName());
//            objectBuilder.add("achternaam", users.getLastName());
//            objectBuilder.add("wachtwoord", users.getPassword());
//
//            databaseQuery.closeDBConnection();
//            return objectBuilder.build().toString();
//        }catch(Exception e){
//            return e.getMessage();
//        }
//    }

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

    @DELETE
    @Path("/{id}")
    public void deleteUserProfile(@PathParam("id") int id){
        try{
            databaseQuery.setDBConnection();

            databaseInfo.deleteUserProfile(id);

            databaseQuery.closeDBConnection();

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @GET
    @Path("/{voornaam}/{wachtwoord}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response userLogIn(@PathParam("voornaam") String voornaam, @PathParam("wachtwoord") String wachtwoord){
        try{
            databaseQuery.setDBConnection();
            ArrayList<User> users = databaseInfo.getUsers();
//            User user = databaseInfo.getUserInfo(voornaam, wachtwoord);

            for(User user : users){
                if(user.getFirstName().equals(voornaam) && user.getPassword().equals(wachtwoord)){
                    return Response.status(200).build();
                }
            }
            databaseQuery.closeDBConnection();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return Response.status(405).build();
    }
}