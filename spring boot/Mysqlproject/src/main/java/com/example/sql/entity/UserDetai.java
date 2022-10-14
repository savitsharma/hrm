package com.example.sql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetai {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	 private int id;
	 private String name;
	 private String email;
	 private double contact;
	 private String address;
	
	 
	 
	public UserDetai() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetai(int id, String name, String email, double contact, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "UserDetai [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", address="
				+ address + "]";
	}

	












}
	 


