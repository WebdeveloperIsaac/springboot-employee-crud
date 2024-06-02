package com.application.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	private String employeeID;

	public Employee(String employeeID, String employeeName, String designation, String projectName,
			String employeeType,String dateofJoining) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.designation = designation;
		this.projectName = projectName;
		this.employeeType = employeeType;
		this.dateofJoining = dateofJoining;
	}

	public String getDateofJoining() {
		return dateofJoining;
	}

	public void setDateofJoining(String dateofJoining) {
		this.dateofJoining = dateofJoining;
	}

	private String employeeName;
	
	private String designation;
	
	private String projectName;
	
	private String dateofJoining;
	
	private String employeeType;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getEmployeeType() {
		return employeeType;
	}



	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", projectName=" + projectName + ", dateofJoining=" + dateofJoining + ", employeeType=" + employeeType
				+ "]";
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	
	
}
