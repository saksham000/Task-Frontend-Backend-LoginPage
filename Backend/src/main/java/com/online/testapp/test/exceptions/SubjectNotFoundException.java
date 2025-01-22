package com.online.testapp.test.exceptions;

public class SubjectNotFoundException extends RuntimeException {
    public SubjectNotFoundException(String message){
        super(message);
    }
}
