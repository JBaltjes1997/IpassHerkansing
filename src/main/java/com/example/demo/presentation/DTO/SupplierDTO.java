package com.example.demo.presentation.DTO;

public class SupplierDTO {
    public String firstName;
    public String lastName;
    public String zipcode;
    public String password;
    public String specialisme;

    public SupplierDTO(String firstName, String lastName, String zipcode, String password, String specialisme) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipcode = zipcode;
        this.password = password;
        this.specialisme = specialisme;
    }

    public SupplierDTO() {
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

    public String getSpecialisme() {
        return specialisme;
    }

    public void setSpecialisme(String specialisme) {
        this.specialisme = specialisme;
    }
}
