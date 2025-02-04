package com.devsofo.ems_server.service;

import com.devsofo.ems_server.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);
}
