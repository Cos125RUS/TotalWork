package org.example.impl;

import org.example.exceptions.EnterChoiceException;

import java.io.IOException;
import java.util.Date;

public interface Enter {
    public int enterChoice() throws IOException, EnterChoiceException;
    public String enterName() throws IOException;
    public Date enterBirthday() throws IOException;
    public String enterCommand() throws IOException;
}
