package com.example.demo.domain;

import java.util.ArrayList;

public class User extends Person{
    public ArrayList<Supplier> suppliers;
    public ArrayList<Request> requests;

    public User() {
    }

    public User(int id, String firstName, String lastName, String zipcode, String city, String adres, String password,
                String mailadress, int phoneNumber, ArrayList<Supplier> suppliers, ArrayList<Request> requests) {
        super(id, firstName, lastName, zipcode, city, adres, password, mailadress, phoneNumber);
        this.suppliers = suppliers;
        this.requests = requests;
    }

    public ArrayList<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(ArrayList<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    public void reportFakeProhile(){}

    public void writeReview(){}

    public void createRequest(){}

    public void updateRequest(){}

    public void deleteRequest(){}
}
