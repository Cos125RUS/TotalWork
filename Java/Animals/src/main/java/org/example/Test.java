package org.example;

import org.example.animals.Animal;
import org.example.animals.Dog;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog("dog", new GregorianCalendar(2007, 5, 12), Arrays.asList("jump", "sit"));
        dog.newCommand("run");
        System.out.println(dog);
    }
}
