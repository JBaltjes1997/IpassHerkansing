package com.example.demo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorTest {

    @Test
    @DisplayName("When a new administrator is made then he should have all the attributes")
    void testNewAdministrator(){
        Administrator admin = new Administrator(1, "Jason", "Bourne",
                "0000AB", "new york", "sesamestreet",  "What's my name?",
                "someone@gmail.com", 5000);

        assertNotNull(admin.getFirstName());
        assertNotNull(admin.getLastName());
        assertNotNull(admin.getZipcode());
        assertNotNull(admin.getCity());
        assertNotNull(admin.getAdres());
        assertNotNull(admin.getPassword());
        assertNotNull(admin.getMailadress());
        assertTrue(admin.getPhoneNumber() > 0);
    }
}