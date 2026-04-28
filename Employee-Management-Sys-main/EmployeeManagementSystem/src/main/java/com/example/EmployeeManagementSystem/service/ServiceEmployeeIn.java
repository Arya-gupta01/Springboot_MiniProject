package com.example.EmployeeManagementSystem.service;

import java.util.List;

import com.example.EmployeeManagementSystem.dto.DtoEmployee;


public interface ServiceEmployeeIn {
     DtoEmployee createEmployee(DtoEmployee dtoEmployee);

    DtoEmployee findById(int id);

    List<DtoEmployee> findAllEmployee();

    DtoEmployee updateEmployee(int id, DtoEmployee updatedemployee);

    void deleteEmployee(int id);
}
