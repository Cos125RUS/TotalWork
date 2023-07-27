package org.example.exceptions;

public class AnimalChoiceException extends RuntimeException {
    public AnimalChoiceException(){
        super("Incorrect animal number entered");
    }
}
