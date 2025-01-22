package com.online.testapp.test.exceptions;

public class TeacherNotFoundException extends RuntimeException {
    public TeacherNotFoundException(String message){
        super(message);
    }
    
}
