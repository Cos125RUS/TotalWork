package org.example.impl;

import org.example.exceptions.EnterChoiceException;

import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;

public interface Enter {
    public int enterChoice() throws InputMismatchException, EnterChoiceException;
    public String enterName() throws InputMismatchException;
    public Date enterBirthday() throws InputMismatchException;
    public String enterCommand() throws InputMismatchException;
    public String enterType() throws InputMismatchException;
    public String enterKind(String type) throws InputMismatchException;
    public String questionNewCommand() throws InputMismatchException;
}
