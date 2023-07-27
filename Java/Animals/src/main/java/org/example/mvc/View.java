package org.example.mvc;

import org.example.animals.Animal;
import org.example.impl.ErrorView;
import org.example.impl.Info;
import org.example.impl.Menu;

import java.util.List;

public class View implements Menu, ErrorView, Info {
    private String mainMenu;
    final String input = " > ";

    public View() {
        mainMenu = createMainMenu();
    }

    @Override
    public void showMenu() {
        System.out.println(mainMenu);
        System.out.print(input);
    }

    @Override
    public String createMainMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Main menu:\n");
        sb.append("1.Show Animals\n");
        sb.append("2.Add Animal\n");
        sb.append("3.Save Changes\n");
        sb.append("4.Teach a new command\n");
        sb.append("0.Exit\n");
        return sb.toString();
    }

    @Override
    public void goodBy() {
        System.out.println("Good By");
    }

    @Override
    public void newAnimal() {
        System.out.println("New Animal is added to registry\n");
    }

    @Override
    public void save() {
        System.out.println("All changes is saved");
    }

    @Override
    public void trainingFinish() {
        System.out.println("Training animal is over");
    }

    @Override
    public void showAnimals(String animals) {
        System.out.println("(Type/Kind)\tName\tBirthday\tCommands");
        System.out.println(animals);
    }

    @Override
    public void enterName() {
        System.out.print("Enter name: ");
    }

    @Override
    public void enterBirthday() {
        System.out.print("Enter birthday(dd.mm.yyyy): ");
    }

    @Override
    public void enterCommand() {
        System.out.print("Enter new command: ");
    }

    @Override
    public void enterType() {
        System.out.print("Enter type: ");
    }

    @Override
    public void enterKind() {
        System.out.print("Enter kind: ");
    }

    @Override
    public void commandQuestion() {
        System.out.print("Would you like to enter a new command? (yes/no): ");
    }

    @Override
    public void enterCommands() {
        System.out.println("Enter commands that the animal knows and can follow");
    }

    @Override
    public void choiceAnimal() {
        System.out.println("Choose the animal you want to train");
    }

    @Override
    public void showAnimalsList(List<Animal> animals) {
        System.out.println("N\t(Type/Kind)\tName\tBirthday\tCommands");
        int i = 1;
        for (Animal animal: animals) {
            System.out.print(i++);
            System.out.print('\t');
            System.out.println(animal.toString());
        }
        System.out.print("\n" + input);
    }

    @Override
    public void inputMismatch() {
        System.out.println("Wrong format of entered data");
    }

    @Override
    public void enterChoice() {
        System.out.println("The specified menu item is missing");
    }

    @Override
    public void typeException() {
        System.out.println("Specified type of animal is unknown");
    }

    @Override
    public void kindException() {
        System.out.println("Unknown kind of animal");
    }

    @Override
    public void nameException() {
        System.out.println("Invalid name");
    }

    @Override
    public void birthdayException() {
        System.out.println("Invalid date");
    }

    @Override
    public void commandException() {
        System.out.println("Invalid command");
    }

    @Override
    public void questionException() {
        System.out.println("Input Error. Please enter 'yes' or 'no'");
    }

    @Override
    public void saveException() {
        System.out.println("Save error");
    }

    @Override
    public void loadException() {
        System.out.println("Load Error! DataBase file is broken");
    }

    @Override
    public void animalChoiceException() {
        System.out.println("Incorrect animal number entered");
    }

    @Override
    public void counterException() {
        System.out.println("Counter Exception");
    }

}
