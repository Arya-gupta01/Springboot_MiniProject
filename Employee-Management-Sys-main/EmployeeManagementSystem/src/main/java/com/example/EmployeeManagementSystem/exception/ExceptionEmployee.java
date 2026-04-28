package com.example.EmployeeManagementSystem.exception;

// Custom exception class for Employee-related errors
// Extends RuntimeException so it becomes an unchecked exception
public class ExceptionEmployee extends RuntimeException {

    // Constructor that accepts a custom error message
    public ExceptionEmployee(String message) {
        // Passes the message to the parent RuntimeException class
        super(message);
    }
}