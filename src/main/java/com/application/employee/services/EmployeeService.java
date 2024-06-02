package com.application.employee.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.employee.model.Employee;
import com.application.employee.model.EmployeeDetails;
import com.application.employee.repo.EmployeeFullRepository;
import com.application.employee.repo.EmployeePersonalRepository;
import com.application.employee.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private EmployeeFullRepository empFullRepo;
	
	
	public List<Employee> getAllEmployeesOfficialDetails(){
		return employeeRepo.findAll();
	}
	
	public Employee addOfficialEmployee(Employee emp) {
		return employeeRepo.save(emp);
	}
	
	public Optional<Employee> getOfficialEmployeeById(String id) {
		return employeeRepo.findById(id);
	}

	public Employee updateEmployee( Employee emp) {
		return employeeRepo.save(emp);
	}

	public void deleteEmployeee(String id) {
		employeeRepo.deleteById(id);;
	}

	public EmployeeDetails addEmployee(EmployeeDetails emp) {
		return empFullRepo.save(emp);
	}

	public List<EmployeeDetails> getAllEmployees() {
		return empFullRepo.findAll();
	}

	public EmployeeDetails getEmployeeById(String id) {
		Optional<EmployeeDetails> emp = empFullRepo.findById(id);
		EmployeeDetails e1 = emp.get();
		e1.setSalary("Confidential");
		return e1;
	}

	public void deleteEmployee(String id) {
		empFullRepo.deleteById(id);
	}
	
}
