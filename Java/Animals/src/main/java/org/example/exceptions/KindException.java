package org.example.exceptions;

public class KindException extends RuntimeException {
    public KindException(){
        super("Unknown kind of animal");
    }
}
