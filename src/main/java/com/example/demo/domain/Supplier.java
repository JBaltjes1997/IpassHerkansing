package com.example.demo.domain;

public class Supplier extends Person {
    String specialisme;

    public Supplier(String firstName, String lastName, String zipcode, int phonenumber, String password, String specialisme) {
        super(firstName, lastName, zipcode, phonenumber, password);
        this.specialisme = specialisme;
    }

    public String getSpecialisme() {
        return specialisme;
    }

    public void setSpecialisme(String specialisme) {
        this.specialisme = specialisme;
    }
}
