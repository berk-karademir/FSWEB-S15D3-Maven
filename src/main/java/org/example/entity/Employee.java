package org.example.entity;

import java.util.Objects;

public class Employee {

    private int id;
    private  String firstname;
    private  String lastname;


    public Employee(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
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
        "First Name: " + firstname + "\n" +
        "Last Name: " + lastname + "\n";
    }
}
