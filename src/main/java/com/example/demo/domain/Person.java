package com.example.demo.domain;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Person {
    @Id
    @GeneratedValue
    public int id;
    public String firstName;
    public String lastName;
    public String mailadress;
    public int phoneNumber;
    public String password;
    public String adres;
    public String zipcode;
    public String city;

    public Person(){}

    public Person(int id, String firstName, String lastName, String zipcode, String city, String adres, String password, String mailadress, int phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipcode = zipcode;
        this.city = city;
        this.adres = adres;
        this.password = password;
        this.mailadress = mailadress;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailadress() {
        return mailadress;
    }

    public void setMailadress(String mailadress) {
        this.mailadress = mailadress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void createProfile(){}

    public void updateProfile(){}

    public void deleteProfile(){}
}
