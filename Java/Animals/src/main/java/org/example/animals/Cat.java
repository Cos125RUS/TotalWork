package org.example.animals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Cat extends Pets{
    public Cat(String name) {
        super(name, "Cat");
    }

    public Cat(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Cat");
    }
}
