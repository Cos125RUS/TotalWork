package org.example.classes;

import java.util.Date;
import java.util.List;

public class Horse extends Packs{
    public Horse(String name) {
        super(name, "Horse");
    }

    public Horse(String name, Date birthday, List<String> commands) {
        super(name, birthday, commands, "Horse");
    }
}
