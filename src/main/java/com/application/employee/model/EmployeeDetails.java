package com.application.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Document
public class EmployeeDetails {

	public EmployeeDetails(String employeeid, String name, String dob, long phone, String address, String mailaddress,
			String dateofJoining, String designation, String projectName, String employeeType, String salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.dob = dob;
		this.phone = phone;
		this.address = address;
		this.mailaddress = mailaddress;
		this.dateofJoining = dateofJoining;
		this.designation = designation;
		this.projectName = projectName;
		this.employeeType = employeeType;
		this.salary = salary;
	}
	@Id
	private String employeeid;
	private String name;
	private String dob;
	private long phone;
	private String address;
	private String mailaddress;
	private String dateofJoining;
	private String designation;
	private String projectName;
	private String employeeType;
	private String salary;
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMailaddress() {
		return mailaddress;
	}
	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}
	public String getDateofJoining() {
		return dateofJoining;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetails [employeeid=" + employeeid + ", name=" + name + ", dob=" + dob + ", phone=" + phone
				+ ", address=" + address + ", mailaddress=" + mailaddress + ", dateofJoining=" + dateofJoining
				+ ", Designation=" + designation + ", projectName=" + projectName + ", employeeType=" + employeeType
				+ ", salary=" + salary + "]";
	}
	public void setDateofJoining(String dateofJoining) {
		this.dateofJoining = dateofJoining;
	}
	public String getdesignation() {
		return designation;
	}
	public void setdesignation(String designation) {
		designation = designation;
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
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
