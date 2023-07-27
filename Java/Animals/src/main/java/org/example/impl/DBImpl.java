package org.example.impl;

import org.example.mvc.Registry;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DBImpl {
    void save(Registry registry) throws IOException;
    String load() throws IOException;
    boolean checkFile();
}
