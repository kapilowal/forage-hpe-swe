package com.example.task;

public class Employee {
    private String employeeId; // Changed to camelCase
    private String firstName;   // Changed to camelCase
    private String lastName;    // Changed to camelCase
    private String email;
    private String title;

    public Employee(String employeeId, String firstName, String lastName, String email, String title) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId; // Changed to camelCase
    }

    public String getFirstName() {
        return firstName; // Changed to camelCase
    }

    public String getLastName() {
        return lastName; // Changed to camelCase
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }
}
