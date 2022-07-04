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
//    public String getUserID(/*@PathParam("voornaam") String voornaam,*/
//                           String wachtwoord) throws SQLException {
//        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
//        try{
//            databaseQuery.setDBConnection();
//            User users = databaseInfo.getUserInfo(wachtwoord);
//
//            objectBuilder.add("id", users.getId());
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

    @GET
    @Path("/{voornaam}/{wachtwoord}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response userLogIn(@PathParam("voornaam") String voornaam, @PathParam("wachtwoord") String wachtwoord){
        try{
            databaseQuery.setDBConnection();
            ArrayList<User> users = databaseInfo.getUsers();

            for(User user : users){
                if(user.getFirstName().equals(voornaam) && user.getPassword().equals(wachtwoord)){
                    return Response.status(200).build();
                }
            }
            databaseQuery.closeDBConnection();

        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }
        return Response.status(405).build();
    }

    @PUT
    @Path("/{current_firstname}/{new_firstname}/{achternaam}/{wachtwoord}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUserProfile(@PathParam("current_firstname") String current_firstname,
                                      @PathParam("new_firstname") String new_firstname,
                                      @PathParam("achternaam") String achternaam,
                                      @PathParam("wachtwoord") String wachtwoord){
        try{
            databaseQuery.setDBConnection();

            Response response = databaseInfo.updateUserProfile(current_firstname, new_firstname, achternaam, wachtwoord );

            databaseQuery.closeDBConnection();

            return response;

        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }

    }

    @DELETE
    @Path("/{wachtwoord}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteUserProfile(@PathParam("wachtwoord") String wachtwoord){
        try{
            databaseQuery.setDBConnection();

            User user = databaseInfo.getUserInfo(wachtwoord);
            int id = user.getId();

            databaseInfo.deleteUserProfile(id);

            databaseQuery.closeDBConnection();

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}