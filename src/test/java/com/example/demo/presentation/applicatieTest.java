package com.example.demo.presentation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Profile;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class applicatieTest {

    @Test
    @DisplayName("When a new profile is made then all non-nullable parameters have to be present")
    void testCreateNewProfile(){
        applicatie a = new applicatie();
        assertTrue((BooleanSupplier) a.createNewUserProfile(5, "Klaas", "Vaak", "niks"));
    }

}