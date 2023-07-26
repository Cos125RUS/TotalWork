package org.example.animals;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class Packs extends Animals{
    protected Packs(String name, String kind) {
        super(name, "Pack", kind);
    }

    protected Packs(String name, Calendar birthday, List<String> commands, String kind) {
        super(name, birthday, commands, "Pack", kind);
    }
}
