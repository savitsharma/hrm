package com.example.demo.exception;

import java.util.List;

public class ExeceptionHandler extends RuntimeException
{
	private List<String> errorList;
	public ExeceptionHandler(String message) {
		super(message);
	}
	
	public ExeceptionHandler(List<String>errorList) {this.errorList=errorList;}
	
	public List<String>getErrorList(){return errorList;}
	
	
	
	

}
