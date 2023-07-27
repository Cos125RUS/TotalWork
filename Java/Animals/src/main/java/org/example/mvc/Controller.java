package org.example.mvc;

import org.example.animals.Animal;
import org.example.exceptions.*;
import org.example.impl.Ctrl;

import java.io.IOException;
import java.util.*;


public class Controller implements Ctrl {
    private View ui;
    private Creator creator;
    private Registry registry;
    private Writer writer;
    private DataBase db;

    public Controller() {
        this.ui = new View();
        this.creator = new Creator();
        this.registry = new Registry();
        this.writer = new Writer();
        this.db = new DataBase();
        load();
    }

    @Override
    public void start() {
        ui.showMenu();
        try {
            int userChoice = writer.enterChoice();
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
                start();
                break;

            case 2:
                newAnimals();
                start();
                break;

            case 3:
                save();
                start();
                break;

            case 4:
                train();
                start();
                break;

            case 0:
                ui.goodBy();
                start();
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
        Animal newAnimal = creator.newAnimal(type, kind, name, birthday, commands);
        registry.newAnimal(newAnimal);
        ui.newAnimal();
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
        List<String> commands = new ArrayList<>();
        ui.enterCommands();
        boolean flag = true;
        while (flag) {
            ui.commandQuestion();
            try {
                flag = writer.questionNewCommand();
                if (flag) {
                    String command = null;
                    do {
                        try {
                            ui.enterCommand();
                            command = writer.enterCommand();
                            commands.add(command);
                        } catch (InputMismatchException | CommandException e) {
                            ui.commandException();
                        }
                    } while (command == null);
                }
            } catch (InputMismatchException | QuestionException e) {
                ui.questionException();
            }
        }
        return commands;
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

    @Override
    public void save() {
        try {
            db.save(registry);
            ui.save();
        } catch (IOException e) {
            ui.saveException();
        }
    }

    @Override
    public void load() {
        if (db.checkFile()) {
            try {
                String loadData = db.load();
                List<Animal> animalList = creator.loadDB(loadData);
                for (Animal animal : animalList) {
                    registry.newAnimal(animal);
                }
            } catch (IOException | BirthdayException e) {
                ui.loadException();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void train() {
        ui.choiceAnimal();
        ui.showAnimalsList(registry.getAnimals());
        try {
            int userChoice = writer.choiceAnimal(registry.getAnimals().size()) - 1;
            Animal trainAnimal = registry.getAnimal(userChoice);
            // добавить тренировку животного

        } catch (InputMismatchException e) {
            ui.inputMismatch();
            train();
        } catch (AnimalChoiceException e) {
            ui.animalChoiceException();
            train();
        }
    }
}
