package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	ResponseEntity<List<Employee>> getAllEmployees() {
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	ResponseEntity<Employee> EmployeeById(@PathVariable("id") Long id) {
		return new ResponseEntity<Employee>(employeeService.EmployeeById(id), HttpStatus.OK);
	}

	@PostMapping("/")
	ResponseEntity<Employee> addEmployee(@RequestBody Employee e) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(e), HttpStatus.CREATED);
	}

}
