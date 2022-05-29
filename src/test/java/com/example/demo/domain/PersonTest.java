package com.example.demo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("Personal information cannot be empty")
    void noEmptyFieldsInPerson() {
        Person persoon = new Person("Clara", "Bella", "1234AB", "Duckstad");
        assertNotNull(persoon.getFirstName());
        assertNotNull(persoon.getLastName());
        assertNotNull(persoon.getZipcode());
        assertNotNull(persoon.getPassword());
    }

}