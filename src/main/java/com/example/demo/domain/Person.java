package com.example.demo.domain;

public class Person {
    String firstName;
    String lastName;
    String zipcode;
    int phonenumber;
    String password;

    public Person(String firstName, String lastName, String zipcode, int phonenumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipcode = zipcode;
        this.phonenumber = phonenumber;
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

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
