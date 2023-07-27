package org.example.impl;

import org.example.animals.Animal;

import java.io.IOException;

public interface Reg {
    void newAnimal(Animal animal) throws Exception;
    String toSave();
    Animal getAnimal(int index);
}
