package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeReposatory;
import com.example.demo.dto.EmployeeDto;

import com.example.demo.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeReposatory employeeReposatory;
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<EmployeeDto> saveEmp(@RequestBody EmployeeDto employeeDto)
    {
        employeeService.saveEmployee(employeeDto);

        return new ResponseEntity<>(employeeDto, HttpStatus.CREATED);
    }


//        @PostMapping("/employee")
//        public EmployeeDto saveEmp(@RequestBody EmployeeDto employeeDto)
//        {
//            employeeService.saveEmployee(employeeDto);
//        //        System.out.println("Hello World");
//            return employeeDto;
//
//        }


//    @GetMapping("/employee")
//    public List<EmployeeDto> getEmployees()
//    {
//        List<EmployeeDto> allEmployee = employeeService.getAllEmployee();
//        return allEmployee;
//    }

    @GetMapping("/employee")
    public ResponseEntity<java.util.List<EmployeeDto>> getEmployees()
    {
       List<EmployeeDto> allEmployee = employeeService.getAllEmployee();
//        if(allEmployee.size()<=0){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
        return ResponseEntity.of(Optional.of(allEmployee));

        //return allEmployee;
    }


    @GetMapping("/employee/{employeeId}")
    public EmployeeDto getEmployeeById(@PathVariable("employeeId") int empId)
    {
        return employeeService.employeeById(empId);
    }


    @DeleteMapping("/employee/{employeeId}")
    public void deleteEmp(@PathVariable("employeeId") int id){
        employeeService.deleteEmployee(id);
    }


    @PutMapping("/employee")
    public ResponseEntity<EmployeeDto> updateEmp(@RequestBody EmployeeDto employeeDto)
    {
        employeeService.updateEmployee(employeeDto);
        return new ResponseEntity<>(employeeDto, HttpStatus.ACCEPTED);
    }


//
//    @GetMapping("/employee")
//    public List<Employee> getEmployee()
//    {
//        List<Employee> allEmployee = employeeService.getAllEmployee();
//
//        return allEmployee;
//    }
}

	
   

