package org.example.exceptions;

public class EnterChoiceException extends RuntimeException{
    public EnterChoiceException(){
        super("The specified menu item is missing");
    }
}
