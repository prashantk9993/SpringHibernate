package com.example.springHibernate.service;

import com.example.springHibernate.model.Employee;
import com.example.springHibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployees(Employee emp){
      return employeeRepository.save(emp);
    }

}
