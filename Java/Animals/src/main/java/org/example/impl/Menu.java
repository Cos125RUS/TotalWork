package org.example.impl;

import java.util.Date;
import java.util.InputMismatchException;

public interface Menu {
    public void showMenu();
    public String createMainMenu();
    public void goodBy();
    public void showAnimals(String animals);
    public void enterName();
    public void enterBirthday();
    public void enterCommand();
    public void enterType();
    public void enterKind();
    public void commandQuestion();
}
