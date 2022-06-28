package com.example.demo.presentation;

//import com.example.demo.data.databaseInfo;
//import com.example.demo.data.databaseQuery;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;

@Path("/aanbiedersApplicatie")
public class supplierApplication {

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getHulpvragen() throws SQLException, ClassNotFoundException {
//        databaseQuery.setDBConnection();
//        JsonArrayBuilder builder = Json.createArrayBuilder();
//        builder.add("Connection gelukt");
//        ArrayList<String> requests = databaseInfo.getRequests();
//        for(String request : requests){
//            JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
//            objectBuilder.add("beschrijving", request.charAt(1));
//            objectBuilder.add("categorie", request.charAt(2));
//            builder.add(objectBuilder);
//        }
//        databaseQuery.closeDBConnection();
//
//        return builder.build().toString();
//    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public ArrayList<String> getUser() throws SQLException {
//        databaseQuery.setDBConnection();
//
//        JsonArrayBuilder builder = Json.createArrayBuilder();
//        ArrayList<String> users = databaseInfo.getUsers();
//        for(String user : users){
//            JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
//            objectBuilder.add("voornaam", user.charAt(1));
//            builder.add(objectBuilder);
//        }
//        databaseQuery.closeDBConnection();
//
//        return users;
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getProgrammeurs(){
        JsonArrayBuilder builder = Json.createArrayBuilder();
        builder.add("werkt dit nog?");

        return builder.build().toString();
    }
}
