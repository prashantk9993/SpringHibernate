package com.example.springHibernate.controller;

import com.example.springHibernate.model.Employee;
import com.example.springHibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployees(@PathVariable("id") Integer employeeId){
        Employee e = new Employee();
       // e.setId(1);
        e.setName("Prashant");
        Employee emp = employeeService.addEmployees(e);
        return new ResponseEntity<>(e, HttpStatus.CREATED);
    }

    @PostMapping("/employees/add")
    public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee){
        Employee emp = employeeService.addEmployees(employee);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }
}
