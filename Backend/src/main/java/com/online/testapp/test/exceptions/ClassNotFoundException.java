package com.online.testapp.test.exceptions;

public class ClassNotFoundException extends RuntimeException {
    public ClassNotFoundException(String message){
        super(message);
    }
    
}
