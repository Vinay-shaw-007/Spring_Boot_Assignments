package com.example.vinay.week1Introduction.introductionToSpringBoot.week2.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
