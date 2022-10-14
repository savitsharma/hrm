package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="hyper")
public class Employee {

	@Id
	private int employeeId;
	
	@NotNull
	private String employeeName;
	
	private String employeeEmail;
	
	private double employeeSalary;
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String getEmployeeEmail() {
		return employeeEmail;
	}



	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}



	public double getEmployeeSalary() {
		return employeeSalary;
	}



	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
