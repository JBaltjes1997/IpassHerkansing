package com.example.demo.presentation;

//import com.example.demo.data.databaseInfo;
//import com.example.demo.data.databaseQuery;

import com.example.demo.data.databaseInfo;
import com.example.demo.data.databaseQuery;
import com.example.demo.domain.Supplier;
import com.example.demo.domain.User;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;

@Path("/aanbiedersApplicatie")
public class supplierApplication {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String allSuppliers() throws SQLException {
        JsonArrayBuilder builder = Json.createArrayBuilder();
        try{
            databaseQuery.setDBConnection();
            ArrayList<Supplier> suppliers = databaseInfo.getSuppliers();
            for(Supplier supplier : suppliers){
                JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
                objectBuilder.add("id", supplier.getId());
                objectBuilder.add("naam", supplier.getFirstName());
                objectBuilder.add("achternaam", supplier.getLastName());
                objectBuilder.add("specialisme", supplier.getSpecialty());
                objectBuilder.add("wachtwoord", supplier.getPassword());
                builder.add(objectBuilder);
            }
            databaseQuery.closeDBConnection();
            return builder.build().toString();

        }catch(Exception e){
            return e.getMessage();
        }
    }

    @POST
    @Path("/{voornaam}/{achternaam}/{wachtwoord}/{specialiteit}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createNewSupplierProfile(@PathParam("voornaam") String voornaam,
                                         @PathParam("achternaam") String achternaam,
                                         @PathParam("wachtwoord") String wachtwoord,
                                             @PathParam("specialiteit") String specialiteit){
        try{
            databaseQuery.setDBConnection();

            Response response = databaseInfo.createNewSupplierProfile(voornaam, achternaam, wachtwoord, specialiteit );

            databaseQuery.closeDBConnection();

            return response;

        } catch (Exception e){
            System.out.println(e.getMessage());
            return Response.status(405).build();
        }
    }

    @GET
    @Path("/{wachtwoord}{voornaam}/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response supplierLogIn(@PathParam("voornaam") String voornaam, @PathParam("wachtwoord") String wachtwoord){
        try{
            databaseQuery.setDBConnection();
            ArrayList<Supplier> suppliers = databaseInfo.getSuppliers();

            for(Supplier supplier : suppliers){
                if(supplier.getFirstName().equals(voornaam) && supplier.getPassword().equals(wachtwoord)){
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

    @GET
    @Path("/{voornaam}")
    @Produces(MediaType.APPLICATION_JSON)
    public String testing(@PathParam("voornaam") String voornaam){
        JsonArrayBuilder builder = Json.createArrayBuilder();
        builder.add("werkt de URL?");

        return builder.build().toString();
        }
}


//    @DELETE
//    @Path("/{wachtwoord}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public void deleteUserProfile(@PathParam("wachtwoord") String wachtwoord){
//        try{
//            databaseQuery.setDBConnection();
//
//            User user = databaseInfo.getSupplierInfo(wachtwoord);
//            int id = user.getId();
//
//            databaseInfo.deleteUserProfile(id);
//
//            databaseQuery.closeDBConnection();
//
//        } catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
