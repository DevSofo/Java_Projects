package com.devsofo.ems_server.service.impl;

import com.devsofo.ems_server.dto.EmployeeDto;
import com.devsofo.ems_server.entity.Employee;
import com.devsofo.ems_server.mapper.EmployeeMapper;
import com.devsofo.ems_server.repository.EmployeeRepository;
import com.devsofo.ems_server.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.toEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);

        return EmployeeMapper.toEmployeeDto(savedEmployee);
    }
}
