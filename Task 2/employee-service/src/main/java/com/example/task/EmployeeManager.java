package com.example.task;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {
    private final List<Employee> employees = new ArrayList<>();

    public EmployeeManager() {
        // Hardcoded employee data
        employees.add(new Employee("1", "John", "Doe", "john.doe@example.com", "Developer"));
        employees.add(new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Manager"));
        // Add more employees as needed
    }

    public List<Employee> getAllEmployees() {
        return employees;  // Return the list of employees
    }
}
