package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	public Employee EmployeeById(Long id) {
		Optional<Employee> e = employeeRepo.findById(id);
		if (e.isPresent()) {
			return e.get();
		} else {
			return null;
		}
	}

	public Employee saveEmployee(Employee e) {
		return employeeRepo.save(e);
	}
}
