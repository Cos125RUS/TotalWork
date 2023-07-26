package org.example.animals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Dog extends Pets{
    public Dog(String name) {
        super(name, "Dog");
    }

    public Dog(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Dog");
    }
}
