package com.devsofo.ems_server.repository;

import com.devsofo.ems_server.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
