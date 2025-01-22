package org.example.entity;

import java.util.Objects;

public class Employee {

    private int id;
    private  String firstName;
    private  String lastName;


    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // uniqueness with id
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "\n" + "Employee's" + "\n" +
        "ID: " + id + "\n" +
        "First Name: " + firstName + "\n" +
        "Last Name: " + lastName + "\n";
    }
}
