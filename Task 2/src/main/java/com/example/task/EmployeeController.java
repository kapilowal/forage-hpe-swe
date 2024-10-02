package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping
    public ResponseEntity<Map<String, List<Employee>>> getEmployees() {
        List<Employee> employees = employeeManager.getAllEmployees();
        Map<String, List<Employee>> response = new HashMap<>();
        response.put("Employees", employees);
        return ResponseEntity.ok(response);
    }
}
