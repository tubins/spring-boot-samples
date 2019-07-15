package com.example.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Employee;

@Component
@Transactional
public class EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("deprecation")
	public List<Employee> getEmployeeList() {
		return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

}
