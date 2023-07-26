package org.example.mvc;

import org.example.exceptions.*;
import org.example.impl.Ctrl;

import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

public class Controller implements Ctrl {
    private View ui;
    private Creator creator;
    private Registry registry;
    private Writer writer;

    public Controller() {
        this.ui = new View();
        this.creator = new Creator();
        this.registry = new Registry();
        this.writer = new Writer();
    }

    @Override
    public void start() {
        int userChoice = 0;
        ui.showMenu();
        try {
            userChoice = writer.enterChoice();
            action(userChoice);
        } catch (InputMismatchException e) {
            ui.inputMismatch();
            start();
        } catch (EnterChoiceException e) {
            ui.enterChoice();
            start();
        }
    }

    @Override
    public void action(int choice) {
        switch (choice) {
            case 1:
                ui.showAnimals(registry.toString());
                break;

            case 2:
                newAnimals();
                break;

            default:
                ui.goodBy();
                break;
        }
    }

    @Override
    public void newAnimals() {
        String type = type();
        String kind = kind(type);
        String name = animalName();
        Calendar birthday = birthday();
        List<String> commands = commands();
    }

    @Override
    public String type() {
        String type = null;
        do {
            ui.enterType();
            try {
                type = writer.enterType();
            } catch (InputMismatchException | TypeException e) {
                ui.typeException();
            }
        } while (type == null);
        return type;
    }

    @Override
    public String kind(String type) {
        String kind = null;
        do {
            ui.enterKind();
            try {
                kind = writer.enterKind(type);
            } catch (InputMismatchException | KindException e) {
                ui.kindException();
            }
        } while (kind == null);
        return kind;
    }

    @Override
    public String animalName() {
        String name = null;
        do {
            ui.enterName();
            try {
                name = writer.enterName();
            } catch (InputMismatchException | NameException e) {
                ui.nameException();
            }
        } while (name == null);
        return name;
    }

    @Override
    public List<String> commands() {

        return null;
    }

    @Override
    public Calendar birthday() {
        Calendar birthday = null;
        do {
            ui.enterBirthday();
            try {
                birthday = writer.enterBirthday();
            } catch (InputMismatchException | BirthdayException e) {
                ui.birthdayException();
            }
        } while (birthday == null);
        return birthday;
    }
}
