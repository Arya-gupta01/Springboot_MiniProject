package com.example.EmployeeManagementSystem.mapper;
// update mapper employee

import com.example.EmployeeManagementSystem.dto.DtoEmployee;
import com.example.EmployeeManagementSystem.model.Employee;

public class MapperEmployee {
    public static Employee mapTOEmployee(DtoEmployee dtoEmployee){
         return new Employee(
                dtoEmployee.getId(),
                dtoEmployee.getFirstname(),
                dtoEmployee.getLastname(),
                dtoEmployee.getEmail()
        );
    }
    // fuction of dtoemployee map to dtoemplooyee
    public static DtoEmployee mapToDtoEmployee(Employee employee){
        return new DtoEmployee(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail()
        );
    }

}
// Mapper class to convert between Employee and DtoEmployee objects
