package org.example.classes;

import java.util.Date;
import java.util.List;

public abstract class Packs extends Animals{
    protected Packs(String name, String kind) {
        super(name, "Pack", kind);
    }

    protected Packs(String name, Date birthday, List<String> commands, String kind) {
        super(name, birthday, commands, "Pack", kind);
    }
}
