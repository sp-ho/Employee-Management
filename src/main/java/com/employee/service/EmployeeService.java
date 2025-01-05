package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeRepository;
import com.employee.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	// Save Employee to the database
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	// Get all employees
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	// Get employee by Id
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	// Update student
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	// Delete Employee
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
	}
	
}
