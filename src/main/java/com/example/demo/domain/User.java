package com.example.demo.domain;



//import javax.persistence.CascadeType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

public class User extends Person{
    public List<Supplier> suppliers = new ArrayList<>();
    public List<Request> requests = new ArrayList<>();

    public User() {
    }

    public User(int id, String firstName, String lastName, String zipcode, String city, String adres, String password,
                String mailadress, int phoneNumber, ArrayList<Supplier> suppliers, ArrayList<Request> requests) {
        super(id, firstName, lastName, zipcode, city, adres, password, mailadress, phoneNumber);
        this.suppliers = suppliers;
        this.requests = requests;
    }

    public ArrayList<Supplier> getSuppliers() {
        return (ArrayList<Supplier>) suppliers;
    }

    public void setSuppliers(ArrayList<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public ArrayList<Request> getRequests() {
        return (ArrayList<Request>) requests;
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
