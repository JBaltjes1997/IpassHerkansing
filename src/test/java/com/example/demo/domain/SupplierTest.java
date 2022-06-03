package com.example.demo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupplierTest {

    @Test
    @DisplayName("A supplier must have a specialty")
    void noEmptyFieldsInSupplier() {
        Supplier sus = new Supplier();
        sus.setSpecialty("loodgieter");
        assertNotNull(sus.getSpecialty());
    }
}