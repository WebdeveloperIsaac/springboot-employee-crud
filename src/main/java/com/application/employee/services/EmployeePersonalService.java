package com.application.employee.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.employee.exceptions.AlreadyPresentException;
import com.application.employee.model.EmployeeDetails;
import com.application.employee.model.EmployeePersonal;
import com.application.employee.repo.EmployeePersonalRepository;

@Service
public class EmployeePersonalService {

	@Autowired
	private EmployeePersonalRepository employeePersonalRepo;
	
	public EmployeePersonal addEmployee(EmployeePersonal emp) throws AlreadyPresentException {
//		List<EmployeePersonal> employees = employeePersonalRepo.findAll();
//		boolean isAlreadyPresent = false;	
//		for(EmployeePersonal em  : employees) {
//			if(emp.getName().equals(em.getName())) {
//				isAlreadyPresent = true;
//			}
//		}
//		if(!isAlreadyPresent) {
			return employeePersonalRepo.save(emp);
//		}
//		else {
//			throw new AlreadyPresentException("Name is Already Present");
//		}
	}

	public List<EmployeePersonal> getEmployees() {
		return employeePersonalRepo.findAll();
	}

	public Optional<EmployeePersonal> getEmployeeById(String id) {
		Optional<EmployeePersonal> emp = employeePersonalRepo.findById(id);
//		EmployeePersonal e1 = emp.get();
//		e1.setSalary(0);
		return emp;
	}

	public EmployeePersonal updateEmployee(EmployeePersonal emp) {
		return employeePersonalRepo.save(emp);
	}

	public void deleteEmployee(String id) {
		employeePersonalRepo.deleteById(id);
	}
	
}
