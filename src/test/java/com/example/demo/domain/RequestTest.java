package com.example.demo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {

    @Test
    @DisplayName("A new request shouldn't have empty fields")
    void testRequestFields(){
        Request r = new Request();
        assertNull(r.getCategory());
        assertNull(r.getDescription());
    }

    @Test
    @DisplayName("A new test should have status 'notCreated' ")
    void testRequestState(){
        Request r = new Request();
        assertEquals(RequestStates.notCreated, r.getState());
    }
}