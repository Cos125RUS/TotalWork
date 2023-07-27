package org.example.impl;

import org.example.exceptions.EnterChoiceException;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

public interface Enter {
    int enterChoice() throws InputMismatchException, EnterChoiceException;
    String enterName() throws InputMismatchException;
    Calendar enterBirthday() throws InputMismatchException;
    String enterCommand() throws InputMismatchException;
    List<String> enterCommands() throws InputMismatchException;
    String enterType() throws InputMismatchException;
    String enterKind(String type) throws InputMismatchException;
    Boolean questionNewCommand() throws InputMismatchException;

}
