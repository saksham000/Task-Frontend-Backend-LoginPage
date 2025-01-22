package com.online.testapp.test.exceptions;

public class StudentAlredyPresentException extends RuntimeException {
    public StudentAlredyPresentException(String message){
        super(message);
    }
    
}
