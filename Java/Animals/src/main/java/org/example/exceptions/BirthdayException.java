package org.example.exceptions;

public class BirthdayException extends RuntimeException{
    public BirthdayException(){
        super("Invalid birthday");
    }
}
