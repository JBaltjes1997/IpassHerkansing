package com.example.demo.presentation.DTO;

import com.example.demo.domain.Request;
import com.example.demo.domain.Supplier;
import com.example.demo.domain.User;

import java.util.ArrayList;

public class UserDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String mailadress;
    private int phoneNumber;
    private String password;
    private String adres;
    private String zipcode;
    private String city;
    private ArrayList<Request> requests;
    private ArrayList<Supplier> suppliers;

    public UserDTO(int id, String firstName, String lastName, String mailadress, int phoneNumber, String password,
                   String adres, String zipcode, String city, ArrayList<Request> requests, ArrayList<Supplier> suppliers) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailadress = mailadress;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.adres = adres;
        this.zipcode = zipcode;
        this.city = city;
        this.requests = requests;
        this.suppliers = suppliers;
    }

    public static UserDTO createNewUserDTO(User user){
        return new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getMailadress(),
                user.getPhoneNumber(),
                user.getPassword(),
                user.getAdres(),
                user.getZipcode(),
                user.getCity(),
                user.getRequests(),
                user.getSuppliers()
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
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

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    public ArrayList<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(ArrayList<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}
