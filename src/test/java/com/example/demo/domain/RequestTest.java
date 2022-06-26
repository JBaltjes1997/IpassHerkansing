package com.example.demo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {

    @Test
    @DisplayName("A new request shouldn't have empty fields")
    void testRequestFields(){
        Request r = new Request();
        r.setDescription("Grasmaaien");
        r.setCategory("Tuin");
        assertNotNull(r.getCategory());
        assertNotNull(r.getDescription());
    }

    @Test
    @DisplayName("A new test should have status 'notCreated' ")
    void testRequestState(){
        Request r = new Request();
        assertEquals(RequestStates.NOT_CREATED, r.getState());
    }

    @Test
    @DisplayName("Any request should have an ID")
    void testRequestHasId(){
        Request r = new Request();
        r.setId(5);
        assertTrue(r.getId() > 0);
    }
}