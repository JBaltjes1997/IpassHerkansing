package com.example.demo.DTO;

import com.example.demo.domain.Supplier;
import com.example.demo.domain.User;

import java.util.ArrayList;

public class SupplierDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String mailadress;
    private int phoneNumber;
    private String password;
    private String adres;
    private String zipcode;
    private String city;
    private String specialty;
    private ArrayList<User> users;

    public SupplierDTO(int id, String firstName, String lastName, String mailadress, int phoneNumber,
                       String password, String adres, String zipcode, String city,
                       String specialty, ArrayList<User> users) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailadress = mailadress;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.adres = adres;
        this.zipcode = zipcode;
        this.city = city;
        this.specialty = specialty;
        this.users = users;
    }

    public SupplierDTO() {
    }

    public static SupplierDTO createNewSupplierDTO(Supplier supplier){
        return new SupplierDTO(
                supplier.getId(),
                supplier.getFirstName(),
                supplier.getLastName(),
                supplier.getMailadress(),
                supplier.getPhoneNumber(),
                supplier.getPassword(),
                supplier.getAdres(),
                supplier.getZipcode(),
                supplier.getCity(),
                supplier.getSpecialty(),
                supplier.getUsers()
        );
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
