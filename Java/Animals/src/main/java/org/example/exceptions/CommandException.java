package org.example.exceptions;

public class CommandException extends RuntimeException{
    public CommandException(){
        super("Invalid command");
    }
}
