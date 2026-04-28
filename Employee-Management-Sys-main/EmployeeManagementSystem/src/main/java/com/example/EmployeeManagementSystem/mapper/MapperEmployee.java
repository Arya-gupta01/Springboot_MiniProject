package com.example.EmployeeManagementSystem.mapper;

import com.example.EmployeeManagementSystem.dto.DtoEmployee;
import com.example.EmployeeManagementSystem.model.Employee;

// Mapper class used to convert between Entity and DTO
// Helps maintain separation between database layer and API layer
public class MapperEmployee {

    // Converts DtoEmployee object to Employee entity
    public static Employee mapTOEmployee(DtoEmployee dtoEmployee){
        return new Employee(
                dtoEmployee.getId(),          // Map ID
                dtoEmployee.getFirstname(),   // Map first name
                dtoEmployee.getLastname(),    // Map last name
                dtoEmployee.getEmail()        // Map email
        );
    }

    // Converts Employee entity to DtoEmployee object
    public static DtoEmployee mapToDtoEmployee(Employee employee){
        return new DtoEmployee(
                employee.getId(),            // Map ID
                employee.getFirstname(),    // Map first name
                employee.getLastname(),     // Map last name
                employee.getEmail()         // Map email
        );
    }
}

}
// Mapper class to convert between Employee and DtoEmployee objects
