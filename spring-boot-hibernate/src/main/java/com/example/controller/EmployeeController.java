package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDAO employeeDAO;

	@RequestMapping("/getEmployeeList")
	public List<Employee> getEmployeeList() {
		return employeeDAO.getEmployeeList();
	}

}
