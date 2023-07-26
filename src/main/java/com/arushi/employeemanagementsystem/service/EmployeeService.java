package com.arushi.employeemanagementsystem.service;

import com.arushi.employeemanagementsystem.dto.EmployeeDto;
import com.arushi.employeemanagementsystem.entity.Employee;

import java.util.List;


public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);

}
