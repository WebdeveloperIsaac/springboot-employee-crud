package com.application.employee.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.application.employee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
