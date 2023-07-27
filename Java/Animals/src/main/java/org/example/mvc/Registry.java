package org.example.mvc;

import org.example.animals.Animal;
import org.example.impl.Reg;

import java.util.ArrayList;
import java.util.List;

public class Registry implements Reg {
    private List<Animal> animals;

    public Registry() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void newAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public String toSave() {
        StringBuilder sb = new StringBuilder();
        for (Animal a: animals) {
            sb.append(a.toSave()).append("\n");
        }
        return sb.toString();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name\tbirthday\tcommands\t(Type/Kind)\n");
        for (Animal a: animals) {
            sb.append(a.toString()).append("\n");
        }
        return sb.toString();
    }
}
