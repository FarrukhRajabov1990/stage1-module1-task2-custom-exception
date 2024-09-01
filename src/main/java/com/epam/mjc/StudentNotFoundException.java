package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {

    public StudentNotFoundException(String string) {
        super(string);
    }
}
