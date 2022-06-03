package com.example.demo.domain.exceptions;

public class NotAllowedException extends RuntimeException{
    public NotAllowedException(String message) {  super(message);  }
}