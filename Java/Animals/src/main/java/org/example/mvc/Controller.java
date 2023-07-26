package org.example.mvc;

import org.example.exceptions.EnterChoiceException;
import org.example.impl.Ctrl;

import java.util.InputMismatchException;

public class Controller implements Ctrl {
    private View ui;
    private Parser parser;
    private Registry registry;
    private Writer writer;

    public Controller() {
        this.ui = new View();
        this.parser = new Parser();
        this.registry = new Registry();
        this.writer = new Writer();
    }

    @Override
    public void start() {
        int userChoice = 0;
        ui.showMenu();
        try {
            userChoice = writer.enterChoice();
        } catch (InputMismatchException e) {
            ui.inputMismatch();
            start();
        } catch (EnterChoiceException e) {
            ui.enterChoice();
            start();
        } finally {
            action(userChoice);
        }
    }

    @Override
    public void action(int choice) {
        switch (choice){
            case 1:
                ui.showAnimals(registry.toString());
                break;

            case 2:

                break;

            default:
                ui.goodBy();
                break;
        }
    }
}
