package org.example.animals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class Animals {
    protected String name;
    protected Calendar birthday;
    protected List<String> commands;
    protected String type;
    protected String kind;

    protected Animals(String name, String type, String kind) {
        this.name = name;
        this.type = type;
        this.kind = kind;
    }

    protected Animals(String name, Calendar birthday, List<String> commands, String type, String kind) {
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

    protected void newCommand(String command){
        commands.add(command);
    }

    @Override
    public String toString() {
        return name + '\t' + birthday + '\t'+ commands+ '\t' + type + '\t' + kind;
    }
}
