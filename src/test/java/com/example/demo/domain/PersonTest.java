package com.example.demo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("When a new person is created then all the info must be present")
    public void newPerson(){
        Person p = new Person(5, "Donald", "Duck", "0000AB", "Duckstad", "ergens",
                "katrien", "donaldduck@gmail.ds", 3131313);

        assertNotNull(p.getFirstName());
        assertNotNull(p.getLastName());
        assertNotNull(p.getZipcode());
        assertNotNull(p.getCity());
        assertNotNull(p.getAdres());
        assertNotNull(p.getPassword());
        assertNotNull(p.getMailadress());
        assertTrue(p.getPhoneNumber() > 0);
    }
}