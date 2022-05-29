package com.example.demo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {
    @Test
    @DisplayName("Test op lege velden in request")
    void noEmptyFieldsInRequest() {
        Request req = new Request("Afvoer zit verstop", "toilet" );
        assertNotNull(req.getDescription());
        assertNotNull(req.getCategory());
    }

}