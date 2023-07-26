package org.example.exceptions;

public class NameException extends RuntimeException{
    public NameException(){
        super("Invalid name");
    }
}
