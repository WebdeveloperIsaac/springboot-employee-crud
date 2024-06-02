package com.application.employee.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Document
public class EmployeePersonal {

	@Id 
	private String name;
	
	private String dateOfBirth;
	
	private String address;
	
	private long phoneNo;
	private long salary;
	
	public EmployeePersonal(String name, String dateOfBirth, String address, long phoneNo, String mailAddress,
			long salary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNo = phoneNo;
		this.mailAddress = mailAddress;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePersonal [name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", phoneNo="
				+ phoneNo + ", mailAddress=" + mailAddress + ", salary=" + salary + "]";
	}

	private String mailAddress;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	
	

	
}
