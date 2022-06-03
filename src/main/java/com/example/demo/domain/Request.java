package com.example.demo.domain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Request {
    public String description;
    public String category;

    @Enumerated(EnumType.STRING)
    private RequestStates state = RequestStates.notCreated;

    public Request(String description, String category) {
        this.description = description;
        this.category = category;
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
}


