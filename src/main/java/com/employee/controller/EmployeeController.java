package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employeeService")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	// Save employee to the database
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	// Get all employees
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	// Get employee by Id
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		return employeeService.getEmployeeById(id);
	}
	
	// Update employee
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	// Delete employee by Id
	@DeleteMapping("/deleteEmployeeById/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		employeeService.deleteEmployeeById(id);
	}
			
}
