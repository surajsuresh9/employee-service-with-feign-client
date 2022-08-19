package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
