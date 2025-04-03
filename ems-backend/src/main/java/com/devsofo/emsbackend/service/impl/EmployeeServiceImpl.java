package com.devsofo.emsbackend.service.impl;

import com.devsofo.emsbackend.dto.EmployeeDto;
import com.devsofo.emsbackend.entity.Employee;
import com.devsofo.emsbackend.mapper.EmployeeMapper;
import com.devsofo.emsbackend.repository.EmployeeRepository;
import com.devsofo.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        // Convert EmployeeDto to Employee entity
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        // Save the employee entity to the database
        Employee savedEmployee = employeeRepository.save(employee);
        // Convert the saved employee entity back to EmployeeDto
        return EmployeeMapper.mapToEmployeeDto(savedEmployee) ;
    }
}
