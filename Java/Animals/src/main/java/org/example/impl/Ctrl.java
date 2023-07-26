package org.example.impl;

import java.util.Date;
import java.util.List;

public interface Ctrl {
    public void start();
    public void action(int choice);
    public void newAnimals();
    public String type();
    public String kind(String type);
    public String animalName();
    public List<String> commands();
    public Date birthday();
}
