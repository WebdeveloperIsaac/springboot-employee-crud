package com.application.employee.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.application.employee.model.EmployeePersonal;

public interface EmployeePersonalRepository extends MongoRepository<EmployeePersonal, String>{

}
