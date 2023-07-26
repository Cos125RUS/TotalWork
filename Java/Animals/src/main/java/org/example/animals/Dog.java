package org.example.classes;

import java.util.Date;
import java.util.List;

public class Dog extends Pets{
    public Dog(String name) {
        super(name, "Dog");
    }

    public Dog(String name, Date birthday, List<String> commands) {
        super(name, birthday, commands, "Dog");
    }
}
