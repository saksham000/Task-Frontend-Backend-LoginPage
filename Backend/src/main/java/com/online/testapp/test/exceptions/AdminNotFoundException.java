package com.online.testapp.test.exceptions;

public class AdminNotFoundException extends RuntimeException {
    public AdminNotFoundException(String message){
        super(message);
    }
}
