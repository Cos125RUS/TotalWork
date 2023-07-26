package org.example.mvc;

import org.example.exceptions.EnterChoiceException;
import org.example.exceptions.KindException;
import org.example.exceptions.TypeException;
import org.example.impl.Enter;

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
    public String enterName() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public Date enterBirthday() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        return null;
    }

    @Override
    public String enterCommand() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public String enterType() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();
        if (!type.equals("pet") && !type.equals("pack"))
           throw new TypeException();
        return type;
    }

    @Override
    public String enterKind(String type) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String kind = scanner.nextLine().toLowerCase();
        if (type.equals("pet")){
            if (!kind.equals("dog") && !kind.equals("cat") && !kind.equals("hamster"))
                throw new KindException();
        } else {
            if (!kind.equals("horse") && !kind.equals("camel") && !kind.equals("donkey"))
                throw new KindException();
        }
        return kind;    }

    @Override
    public String questionNewCommand() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();    }
}
