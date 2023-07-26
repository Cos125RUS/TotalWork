package org.example.classes;

import java.util.Date;
import java.util.List;

public abstract class Animals {
    protected String name;
    protected Date birthday;
    protected List<String> commands;
    protected String type;
    protected String kind;

    protected Animals(String name, String type, String kind) {
        this.name = name;
        this.type = type;
        this.kind = kind;
    }

    protected Animals(String name, Date birthday, List<String> commands, String type, String kind) {
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

    protected void NewCommand(String command){
        commands.add(command);
    }
}
