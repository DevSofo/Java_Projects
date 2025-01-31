package com.devsofo.ems_server.service;

import com.devsofo.ems_server.dto.EmployeeDto;
import org.springframework.stereotype.Service;



public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
