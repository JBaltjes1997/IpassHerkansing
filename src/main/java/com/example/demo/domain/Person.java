package com.example.demo.domain;

import javax.persistence.*;

@Entity
public class Person {
    public String firstName;
    public String lastName;
    public String zipcode;
    public String password;

    public Person(String firstName, String lastName, String zipcode, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipcode = zipcode;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
