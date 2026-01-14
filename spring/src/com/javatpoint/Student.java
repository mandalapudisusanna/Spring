package com.javatpoint;

public class Student {

    private int id;
    private String name;

    // setter method
    public void setId(int id) {
        this.id = id;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
    }
}
