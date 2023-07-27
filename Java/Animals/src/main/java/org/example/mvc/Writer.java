package org.example.mvc;

import org.example.exceptions.*;
import org.example.impl.Enter;

import java.util.*;

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
        String name = scanner.nextLine().toLowerCase();
        if (name.length() == 0 || !name.matches("[^0-9]+"))
            throw new NameException();
        return name;
    }

    @Override
    public Calendar enterBirthday() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine().toLowerCase();
        if (!checkDateString(date))
            throw new BirthdayException();
        String[] arrDate = date.replace(".", "/").split("/");
        Integer[] arrInt = new Integer[arrDate.length];
        for (int i = 0; i < 3; i++) {
            arrInt[i] = Integer.parseInt(arrDate[i]);
        }
        if (!checkDateArray(arrInt))
            throw new BirthdayException();
        return new GregorianCalendar(arrInt[0],arrInt[1]-1, arrInt[2]);
    }

    @Override
    public String enterCommand() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.length() == 0 || !command.matches("[^0-9]+"))
            throw new CommandException();
        return command;
    }

    @Override
    public List<String> enterCommands() throws InputMismatchException {
        return null;
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
        if (type.equals("pet")) {
            if (!kind.equals("dog") && !kind.equals("cat") && !kind.equals("hamster"))
                throw new KindException();
        } else {
            if (!kind.equals("horse") && !kind.equals("camel") && !kind.equals("donkey"))
                throw new KindException();
        }
        return kind;
    }

    @Override
    public Boolean questionNewCommand() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (!answer.equals("yes") && !answer.equals("no") && !answer.equals("y") && !answer.equals("n")){
            throw new QuestionException();
        }
        if (answer.equals("no"))
            return false;
        return true;
    }

    @Override
    public boolean checkDateString(String date) {
        if (date.length() == 0 || !date.toLowerCase().matches("[^a-z]+"))
            return false;
        else if (!date.contains("."))
            return false;
        return true;
    }

    @Override
    public boolean checkDateArray(Integer[] date) {
        if (date.length != 3) {
            return false;
        }
        if (date[2] < 1950 || date[2] > 2023)
            return false;
        if (date[1] < 1 || date[1] > 12)
            return false;
        if (date[0] < 1)
            return false;
        switch (date[1]){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (date[0] > 31)
                    return false;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (date[0] > 30)
                    return false;
                break;

            case 2:
                if (date[2]%4 != 0) {
                    if (date[0] > 28)
                        return false;
                }
                else {
                    if (date[0] > 29)
                        return false;
                }
                break;
        }
        return true;
    }
}
