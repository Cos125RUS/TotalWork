package org.example.animals;

import java.util.Calendar;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected Calendar birthday;
    protected List<String> commands;
    protected String type;
    protected String kind;

    protected Animal(String name, String type, String kind) {
        this.name = name;
        this.type = type;
        this.kind = kind;
    }

    protected Animal(String name, Calendar birthday, List<String> commands, String type, String kind) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
        this.type = type;
        this.kind = kind;
    }

    protected String getType() {
        return type;
    }

    protected String getKind() {
        return kind;
    }

    protected void newCommand(String command) {
        commands.add(command);
    }

    public String toSave(){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(';');
        sb.append(birthday.get(Calendar.DAY_OF_MONTH)).append('.');
        Integer month = birthday.get(Calendar.MONTH) + 1;
        if (month < 10) {
            sb.append('0');
        }
        sb.append(month).append('.');
        sb.append(birthday.get(Calendar.YEAR)).append(';');
        for (String command : commands) {
            sb.append(command).append("/");
        }
        sb.append(';').append(type).append(';').append(kind);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append('\t');
        sb.append(birthday.get(Calendar.DAY_OF_MONTH)).append('.');
        Integer month = birthday.get(Calendar.MONTH) + 1;
        if (month < 10) {
            sb.append('0');
        }
        sb.append(month).append('.');
        sb.append(birthday.get(Calendar.YEAR)).append('\t');
        for (String command : commands) {
            sb.append(command).append("  ");
        }
        sb.append('\t').append('(').append(type).append('/').append(kind).append(')');
        return sb.toString();
    }
}
