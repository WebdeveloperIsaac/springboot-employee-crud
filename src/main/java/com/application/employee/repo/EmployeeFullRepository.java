package com.application.employee.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.application.employee.model.EmployeeDetails;

public interface EmployeeFullRepository extends MongoRepository<EmployeeDetails, String>{

}
