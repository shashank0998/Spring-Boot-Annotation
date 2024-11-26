package com.spring.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository 
{
	// db operation get employee from database
	
	public String getEmployee()
	{
		return "employee";
	}
}
