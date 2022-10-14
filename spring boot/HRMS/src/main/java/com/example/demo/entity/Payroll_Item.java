package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" Payroll_Item")
public class Payroll_Item {
	@Id
	
	private int id;
	private int payrollid;
	private int employeeid;
	private String present;
	private String absent;
	private String late;
	private double salary;
	private double allowance_amount;
	private String allownces_type;
	private double deduction_amouont;
	private double deductions;
	private double gross_net;
	private String data_created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPayrollid() {
		return payrollid;
	}
	public void setPayrollid(int payrollid) {
		this.payrollid = payrollid;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getPresent() {
		return present;
	}
	public void setPresent(String present) {
		this.present = present;
	}
	public String getAbsent() {
		return absent;
	}
	public void setAbsent(String absent) {
		this.absent = absent;
	}
	public String getLate() {
		return late;
	}
	public void setLate(String late) {
		this.late = late;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAllowance_amount() {
		return allowance_amount;
	}
	public void setAllowance_amount(double allowance_amount) {
		this.allowance_amount = allowance_amount;
	}
	public String getAllownces_type() {
		return allownces_type;
	}
	public void setAllownces_type(String allownces_type) {
		this.allownces_type = allownces_type;
	}
	public double getDeduction_amouont() {
		return deduction_amouont;
	}
	public void setDeduction_amouont(double deduction_amouont) {
		this.deduction_amouont = deduction_amouont;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	public double getGross_net() {
		return gross_net;
	}
	public void setGross_net(double gross_net) {
		this.gross_net = gross_net;
	}
	public String getData_created() {
		return data_created;
	}
	public void setData_created(String data_created) {
		this.data_created = data_created;
	}
	
	
	public String toString() {
		return "Payroll_Item [id=" + id + ", payrollid=" + payrollid + ", employeeid=" + employeeid + ", present="
				+ present + ", absent=" + absent + ", late=" + late + ", salary=" + salary + ", allowance_amount="
				+ allowance_amount + ", allownces_type=" + allownces_type + ", deduction_amouont=" + deduction_amouont
				+ ", deductions=" + deductions + ", gross_net=" + gross_net + ", data_created=" + data_created + "]";
	}
	
	
	

}
