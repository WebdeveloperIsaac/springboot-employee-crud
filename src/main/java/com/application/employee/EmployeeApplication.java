package com.application.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

import com.application.employee.config.SecurityConfig;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class })
@Import({ SecurityConfig.class })
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		System.out.println("Employee Application");
	}

}
