package com.example.demo.domain;

public class Supplier extends Person {
    public String specialisme;

    public Supplier() {
    }

    public Supplier(int id, String firstName, String lastName, String zipcode, String city, String adres, String password, String mailadress, int phoneNumber, String specialisme) {
        super(id, firstName, lastName, zipcode, city, adres, password, mailadress, phoneNumber);
        this.specialisme = specialisme;
    }

    public String getSpecialisme() {
        return specialisme;
    }

    public void setSpecialisme(String specialisme) {
        this.specialisme = specialisme;
    }
}
