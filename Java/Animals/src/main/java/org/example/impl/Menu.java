package org.example.impl;

import java.util.Date;
import java.util.InputMismatchException;

public interface Menu {
    void showMenu();
    String createMainMenu();
    void showAnimals(String animals);
    void enterName();
    void enterBirthday();
    void enterCommand();
    void enterType();
    void enterKind();
    void commandQuestion();
    void enterCommands();
}
