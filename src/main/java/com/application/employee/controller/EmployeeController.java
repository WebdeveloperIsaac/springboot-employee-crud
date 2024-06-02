package com.application.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.employee.exceptions.AlreadyPresentException;
import com.application.employee.model.Employee;
import com.application.employee.model.EmployeeDetails;
import com.application.employee.model.EmployeePersonal;
import com.application.employee.repo.EmployeeRepository;
import com.application.employee.services.EmployeePersonalService;
import com.application.employee.services.EmployeeService;

@RestController
public class EmployeeController {
		
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private EmployeePersonalService empPersonalService;

	@GetMapping("/check")
	public String greet() {
		return "Connection is Stable";
	}
	
	@PostMapping("/official/addEmployee")
	public Employee addEmployeeOfficial(@RequestBody Employee employee) {
		return empService.addOfficialEmployee(employee);
	}
	
	@GetMapping("/official/getEmployees")
	public List<Employee> getEmployees(){
		return empService.getAllEmployeesOfficialDetails();
	}
	
//	@GetMapping("official/getemployee/{id}")
//	public Optional<Employee> getEmployee(@PathVariable String id){
//		return empService.getEmployeeById(id);
//	}
	
	@PostMapping("official/updateEmployee/{id}")
	public Employee updateEmployee(@PathVariable String id,@RequestBody Employee emp) {
		System.out.println(emp.toString());
		return empService.updateEmployee(emp);
	}
	
	@DeleteMapping("official/deleteEmployee/{id}")
	public void deleteOfficialEmployee(@PathVariable String id ) {
		empService.deleteEmployeee(id);
	}
	
//------------------------------------------------------------------------------------------------------
	
	@PostMapping("/personal/addEmployee")
	public EmployeePersonal addEmployeePersonal(@RequestBody EmployeePersonal emp) throws AlreadyPresentException {
		return empPersonalService.addEmployee(emp);
	}
//	
	@GetMapping("/personal/getEmployees")
	public List<EmployeePersonal> getEmployeesPersonal(){
		return empPersonalService.getEmployees();
	}
//	
	@GetMapping("/personal/getEmployee/{id}")
	public Optional<EmployeePersonal> getEmployesPersonal(@PathVariable String id){
		return empPersonalService.getEmployeeById(id);
	}
	
	@PostMapping("personal/updateEmployee/{id}")
	public EmployeePersonal updateEmployeePersonal(@PathVariable String id,@RequestBody EmployeePersonal emp) {
		return empPersonalService.updateEmployee(emp);
	}
	
	@DeleteMapping("personal/deleteEmployee/{id}")
	public void deleteEmployeePersonal(@PathVariable String id) {
		empPersonalService.deleteEmployee(id);
		System.out.println("Deleted");
	}
	
//------------------------------------------------------------------------------------
	
	@PostMapping("addEmployee")
	public EmployeeDetails addEmployee(@RequestBody EmployeeDetails emp ) {
		return empService.addEmployee(emp);
	}
	
	@PostMapping("updateEmployee/{id}")
	public EmployeeDetails updateEmployee(@PathVariable String id,@RequestBody EmployeeDetails emp ) {
		return empService.addEmployee(emp);
	}
	
	@GetMapping("getEmployees")
	public List<EmployeeDetails> getAllEmployees(){
		return empService.getAllEmployees();
	}
	
	@GetMapping("getEmployee/{id}")
	public EmployeeDetails getEmployeeById(@PathVariable String id) {
		return empService.getEmployeeById(id);
	}
	
	@DeleteMapping("deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable String id) {
		 empService.deleteEmployee(id);
	}
	
}
