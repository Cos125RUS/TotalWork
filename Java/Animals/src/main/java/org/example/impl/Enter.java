package org.example.impl;

import org.example.exceptions.EnterChoiceException;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;

public interface Enter {
    int enterChoice() throws InputMismatchException, EnterChoiceException;
    String enterName() throws InputMismatchException;
    Calendar enterBirthday() throws InputMismatchException;
    String enterCommand() throws InputMismatchException;
    String enterType() throws InputMismatchException;
    String enterKind(String type) throws InputMismatchException;
    String questionNewCommand() throws InputMismatchException;
    boolean checkDateString(String date);
    boolean checkDateArray(Integer[] date);
}
