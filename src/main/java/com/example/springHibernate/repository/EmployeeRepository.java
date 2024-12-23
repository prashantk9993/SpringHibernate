package com.example.springHibernate.repository;

import com.example.springHibernate.model.Employee;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
