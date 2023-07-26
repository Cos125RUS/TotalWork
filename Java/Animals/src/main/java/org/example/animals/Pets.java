package org.example.animals;

import java.util.Date;
import java.util.List;

public abstract class Pets extends Animals{
    protected Pets(String name, String kind) {
        super(name, "Pet", kind);
    }

    protected Pets(String name, Date birthday, List<String> commands, String kind) {
        super(name, birthday, commands, "Pet", kind);
    }
}
