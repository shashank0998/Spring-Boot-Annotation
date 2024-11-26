package com.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.annotation.entity.Employee;
import com.spring.annotation.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	
	
	//@RequestMapping(path = "/getEmployee" , method = RequestMethod.GET)
	//@ResponseBody
	@GetMapping("/getEmployee")
	public String getEmployee()
	{
		return employeeService.getEmployee();
	}
	
	@GetMapping("/getEmployeesById")
	public String getEmployeeById(@RequestParam int empId)
	{
		return "employee";
	}
	
	@GetMapping("/getEmployeesByPathId/{empolyeeId}")
	public String getEmployeeByPathId(@PathVariable int empId)
	{
		return "employee";
	}
	
	//@RequestMapping(path = "/addEmployee", method = RequestMethod.POST)
	@PostMapping("/addEmployee")
	public String addEmplyee(@RequestBody Employee employee)
	{
		return "add";
	}
	
	//@RequestMapping(path = "/updateEmployee", method = RequestMethod.PUT)
	@PostMapping("/updateEmployee")
	public String updateEmplyee(Employee employee)
	{
		return "updated";
	}
	
	//@RequestMapping(path = "/deleteEmployee", method = RequestMethod.DELETE)
	@DeleteMapping("/deleteEmployee")
	public String deleteEmplyee(Employee employee)
	{
		return "deleted";
	}
	
	
}
