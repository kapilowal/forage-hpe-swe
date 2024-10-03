package com.example.task;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;
    private String email;
    private String title;

    // Constructor, Getters, and Setters
    public Employee(String firstName, String lastName, int employeeId, String email, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.email = email;
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
