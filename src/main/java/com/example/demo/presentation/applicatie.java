package com.example.demo.presentation;

import com.example.demo.data.databaseInfo;
import com.example.demo.data.databaseQuery;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.json.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.sql.Date;

@Path("/applicatie")
public class applicatie {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getProgrammeurs(){
        JsonArrayBuilder builder = Json.createArrayBuilder();
        builder.add("werkt de prog tab?");

        return builder.build().toString();
    }

    @POST
    @Path("/{id}/{voornaam}/{achternaam}/{wachtwoord}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createNewUserProfile(@PathParam("id") int id, @PathParam("voornaam") String voornaam,
                                      @PathParam("achternaam") String achternaam,
                                      @PathParam("wachtwoord") String wachtwoord){
        try{
            databaseQuery.setDBConnection();

            Response response = databaseInfo.createNewUserProfile(id, voornaam, achternaam, wachtwoord );

            databaseQuery.closeDBConnection();

            return response;

        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }
    }
}