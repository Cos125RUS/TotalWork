package org.example.mvc;

import org.example.animals.Animal;
import org.example.impl.Reg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Registry implements Reg {
    private List<Animal> animals;
//    private Counter counter;

    public Registry() {
        this.animals = new ArrayList<>();
//        this.counter = new Counter();
    }

    @Override
    public void newAnimal(Animal animal) throws Exception {
        try (Counter counter = new Counter()) {
            animals.add(animal);
            counter.add();
        }
    }

    @Override
    public String toSave() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : animals) {
            sb.append(a.toSave()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Animal getAnimal(int index) {
        return animals.get(index);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : animals) {
            sb.append(a.toString()).append("\n");
        }
        return sb.toString();
    }
}
