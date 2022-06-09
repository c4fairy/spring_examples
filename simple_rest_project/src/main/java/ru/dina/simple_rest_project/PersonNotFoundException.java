package ru.dina.simple_rest_project;

public class PersonNotFoundException extends RuntimeException{
    PersonNotFoundException(Long id) {
        super("Could not find person " + id);
    }
}
