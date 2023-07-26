package org.example.animals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Hamster extends Pets{
    public Hamster(String name) {
        super(name, "Hamster");
    }

    public Hamster(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Hamster");
    }
}
