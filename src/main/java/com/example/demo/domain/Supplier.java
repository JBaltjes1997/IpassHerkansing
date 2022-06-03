package com.example.demo.domain;

public class Supplier extends Person {
    public String specialty;

    public Supplier() {
    }

    public Supplier(int id, String firstName, String lastName, String zipcode, String city, String adres, String password, String mailadress, int phoneNumber, String specialty) {
        super(id, firstName, lastName, zipcode, city, adres, password, mailadress, phoneNumber);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
