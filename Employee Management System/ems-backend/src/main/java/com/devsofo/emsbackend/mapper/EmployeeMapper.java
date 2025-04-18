package com.devsofo.emsbackend.mapper;

import com.devsofo.emsbackend.dto.EmployeeDto;
import com.devsofo.emsbackend.entity.Employee;

public class EmployeeMapper {
    // Convert EmployeeDto to Employee entity
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    // Convert Employee entity to EmployeeDto
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
