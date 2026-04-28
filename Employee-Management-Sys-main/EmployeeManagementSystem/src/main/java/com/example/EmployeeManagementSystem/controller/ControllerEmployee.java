
package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.dto.DtoEmployee;
import com.example.EmployeeManagementSystem.service.ServiceEmployeeIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Marks this class as a REST controller (handles HTTP requests)
@CrossOrigin("*") // Allows requests from any origin (useful for frontend-backend connection)
@RequestMapping("api/employee") // Base URL for all endpoints in this controller

public class ControllerEmployee {

    // Injecting service layer dependency
    // Injecting Service Layer dependency
    @Autowired
    private ServiceEmployeeIn serviceEmployee;

    // CREATE: Add a new employee
    @PostMapping
    public ResponseEntity<DtoEmployee> createEmployee(@RequestBody DtoEmployee dtaEmployee){
        // Calls service layer to save employee data
        DtoEmployee e = serviceEmployee.createEmployee(dtaEmployee);

        // Returns created employee with HTTP 201 status
        return new ResponseEntity<>(e, HttpStatus.CREATED);
    }

    // READ: Get employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<DtoEmployee> findById(@PathVariable("id") int id){
        // Fetch employee from service layer
        DtoEmployee e = serviceEmployee.findById(id);

        // Return employee with HTTP 200 status
        return new ResponseEntity<>(e, HttpStatus.OK);
    }

    // READ: Get all employees
    @GetMapping
    public ResponseEntity<List<DtoEmployee>> findAllEmployee(){
        // Fetch all employees from service layer
        List<DtoEmployee> employees = serviceEmployee.findAllEmployee();

        // Return list with HTTP 200 status
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    // UPDATE: Update employee details by ID
    @PutMapping("/{id}")
    public ResponseEntity<DtoEmployee> updateEmployee(
            @PathVariable("id") int id,
            @RequestBody DtoEmployee updatedemployee){

        // Call service layer to update employee
        DtoEmployee updatedemp = serviceEmployee.updateEmployee(id, updatedemployee);

        // Return updated employee with HTTP 200 status
        return new ResponseEntity<>(updatedemp, HttpStatus.OK);
    }

    // DELETE: Remove employee by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
        // Call service layer to delete employee
        serviceEmployee.deleteEmployee(id);

        // Return success message
        return ResponseEntity.ok("This Employee is Deleted successfully");
    }
}