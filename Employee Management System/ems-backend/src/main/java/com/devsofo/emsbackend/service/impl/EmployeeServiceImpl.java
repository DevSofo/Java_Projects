package com.devsofo.emsbackend.service.impl;

import com.devsofo.emsbackend.dto.EmployeeDto;
import com.devsofo.emsbackend.entity.Employee;
import com.devsofo.emsbackend.exception.ResourceNotFoundException;
import com.devsofo.emsbackend.mapper.EmployeeMapper;
import com.devsofo.emsbackend.repository.EmployeeRepository;
import com.devsofo.emsbackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        // Fetch all employees from the database
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(EmployeeMapper::mapToEmployeeDto).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
        // Check if the employee exists
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));

        // Update the employee's details
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());

        // Save the updated employee entity to the database
        Employee updatedEmployeeObj = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));
        // Delete the employee entity from the database
        employeeRepository.deleteById(employeeId);

    }
}
