package ru.alex.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {
    private static int idCounter=1;
    private int id;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;
    @Min(value = 0, message = "Age should be greater then 0")
    private int age;
    @Email(message = "Email should be valid")
    private String email;

    public Person(){
        id=idCounter;
        idCounter++;
    }

    public Person(String name) {
        this.name = name;
        id=idCounter;
        idCounter++;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void setIdCounter(int idCounter) {
        Person.idCounter = idCounter;
    }

    public void setName(String name) {
        this.name = name;
    }
}
