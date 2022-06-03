package com.example.demo.presentation.DTO;

import com.example.demo.domain.Request;
import com.example.demo.domain.RequestStates;

public class RequestDTO {
    private int id;
    private String category;
    private String description;
    private RequestStates state;

    public RequestDTO(int id, String description, String category, RequestStates state) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.state = state;
    }

    public static RequestDTO createRequestDTO(Request request){
        return new RequestDTO(
                request.getId(),
                request.getDescription(),
                request.getCategory(),
                request.getState()
        );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RequestStates getState() {
        return state;
    }

    public void setState(RequestStates state) {
        this.state = state;
    }
}
