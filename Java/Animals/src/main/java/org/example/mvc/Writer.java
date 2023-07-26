package org.example.mvc;

import org.example.exceptions.EnterChoiceException;
import org.example.impl.Enter;

import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Writer implements Enter {
    @Override
    public int enterChoice() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice >= 0 && choice <= 2)
            return choice;
        else
            throw new EnterChoiceException();
    }

    @Override
    public String enterName() throws IOException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public Date enterBirthday() throws IOException {
        Scanner scanner = new Scanner(System.in);
        return null;
    }

    @Override
    public String enterCommand() throws IOException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
