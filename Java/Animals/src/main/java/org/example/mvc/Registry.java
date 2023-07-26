package org.example.mvc;

import org.example.animals.Animals;
import org.example.impl.Reg;

import java.util.ArrayList;
import java.util.List;

public class Registry implements Reg {
    private List<Animals> animals;

    public Registry() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void newAnimal(Animals animal) {
        animals.add(animal);
    }

    public List<Animals> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("type\tkind\tname\tbirthday\tcommands");
        for (Animals a: animals) {
            sb.append(a.toString()).append("\n");
        }
        return sb.toString();
    }
}
