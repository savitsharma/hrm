package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeReposatory;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.exception.ExeceptionHandler;
import com.example.demo.message.ResponseMessage;

@Service
public class EmployeeService {
	
	
	
	    @Autowired
	    EmployeeReposatory employeeReposatory;

      ResponseMessage<EmployeeDto> employeedto=null;

	  
	    public ResponseMessage<EmployeeDto> saveEmployee(EmployeeDto employeeDto)
	    {
	    	ResponseMessage<EmployeeDto> responseMessage;
			try {
				
	    		employeeReposatory.save(employeeDtoToEmployee(employeeDto)); 
	    	responseMessage = ResponseMessage.withResponseData(employeeDto, "no value", "message");
	    		
			} catch (Exception e) {

		throw new ExeceptionHandler(String.format("Invalid Employee Name %s",e));
//				e.printStackTrace();
			}
	        
	    	return responseMessage;

	    }
	    public List<EmployeeDto> getAllEmployee(){

	        List<Employee> listEmployee= this.employeeReposatory.findAll();

	        List<EmployeeDto> userDtoList = listEmployee.stream().map(emp -> this.employeeToEmployeeDto(emp)).collect(Collectors.toList());

	        //employeeReposatory.findAll().forEach(l1->listEmployee.add(l1));

	        return userDtoList;
	    }

	    public void deleteEmployee(int empId){

	        employeeReposatory.deleteById(empId);

	    }
	    public EmployeeDto updateEmployee(EmployeeDto employeeDto)
	    {
	    employeeReposatory.save(employeeDtoToEmployee(employeeDto));
	    return employeeDto;

	    }


	    public EmployeeDto employeeById(Integer employeeId)
	    {
	        Employee employee = this.employeeReposatory.findById(employeeId).get();
	        // Optional<Employee> byId = employeeReposatory.findById(employeeId);
	        return this.employeeToEmployeeDto(employee);

	    }


	    public Employee employeeDtoToEmployee(EmployeeDto employeeDto)
	    {
	        Employee employee=new Employee();

	        employee.setEmployeeId(employeeDto.getEmployeeId());

	        employee.setEmployeeEmail(employeeDto.getEmployeeEmail());

	        employee.setEmployeeName(employeeDto.getEmployeeName());

	        employee.setEmployeeEmail(employeeDto.getEmployeeEmail());

	        employee.setEmployeeSalary(employeeDto.getEmployeeSalary());

	        return employee;
	    }

	    public EmployeeDto employeeToEmployeeDto(Employee employee)
	    {
	        EmployeeDto employeeDto= new EmployeeDto();

	        employeeDto.setEmployeeId(employee.getEmployeeId());;

	        employeeDto.setEmployeeEmail(employee.getEmployeeEmail());

	        employeeDto.setEmployeeName(employee.getEmployeeName());

	        employeeDto.setEmployeeEmail(employee.getEmployeeEmail());

	        employeeDto.setEmployeeSalary(employee.getEmployeeSalary());

	        return employeeDto;
	    }








//	    public List<Employee> getAllEmployee()
//	    {
//	        List<Employee> list= new ArrayList<Employee>();
//	        employeeReposatory.findAll().forEach(l1->list.add(l1));
//	        return list;
//	    }

	}

	  
		
		
	


