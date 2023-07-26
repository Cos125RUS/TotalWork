package org.example.animals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Camel extends Packs{
    public Camel(String name) {
        super(name, "Camel");
    }

    public Camel(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Camel");
    }
}
