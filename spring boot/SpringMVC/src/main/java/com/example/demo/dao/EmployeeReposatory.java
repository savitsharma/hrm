package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Employee;

public interface EmployeeReposatory extends JpaRepository<Employee, Integer> {

	

}
