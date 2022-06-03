package com.example.demo.domain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Request {
    @Id
    @GeneratedValue
    public int id;
    public String description;
    public String category;

    @Enumerated(EnumType.STRING)
    private RequestStates state = RequestStates.NOT_CREATED;

    public Request(int id, String description, String category, RequestStates state) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.state = state;
    }

    public Request() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public RequestStates getState() {
        return state;
    }

    public void setState(RequestStates state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


