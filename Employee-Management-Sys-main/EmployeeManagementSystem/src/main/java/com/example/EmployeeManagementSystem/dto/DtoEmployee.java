package com.example.EmployeeManagementSystem.dto;

// DTO (Data Transfer Object) class used to transfer employee data
// between layers (Controller <-> Service <-> Client)
public class DtoEmployee {

    // Unique ID of the employee
    private int id;

    // First name of the employee
    private String firstname;

    // Last name of the employee
    private String lastname;

    // Email address of the employee
    private String email;

    // Default constructor (required for frameworks like Spring & Jackson)
    public DtoEmployee() {
    }

    // Parameterized constructor to initialize all fields
    public DtoEmployee(int id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
    // to get the features

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Setter for first name
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // Setter for last name
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for first name
    public String getFirstname() {
        return firstname;
    }

    // Getter for last name
    public String getLastname() {
        return lastname;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }
}