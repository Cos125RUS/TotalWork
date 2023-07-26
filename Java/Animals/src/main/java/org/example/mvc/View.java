package org.example.mvc;

import org.example.impl.ErrorView;
import org.example.impl.Menu;

public class View implements Menu, ErrorView {
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
        sb.append("0.Exit\n");
        return sb.toString();
    }

    @Override
    public void goodBy() {
        System.out.println("Good By");
    }

    @Override
    public void showAnimals(String animals) {
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

}
