package com.example.demo.domain;

public class Administrator extends Person{
    public Administrator(int id, String firstName, String lastName, String zipcode, String city, String adres, String password, String mailadress, int phoneNumber) {
        super(id, firstName, lastName, zipcode, city, adres, password, mailadress, phoneNumber);
    }

    public Administrator(){}

    public void removeFakeProfile(){}
}
