package com.indu.app.Ex1.service;
import com.indu.app.Ex1.model.Employee;

import com.indu.app.Ex1.repository.EmployeeRepository;
import com.indu.app.Ex1.repository.HibernateEmployeeRepository;
import com.oracle.webservices.internal.api.message.PropertySet.Property;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.*;

@Service("employeeService")
public class EmployeeService implements EmployeeServiceImp {

	EmployeeRepository employeeRepository;
//	=new HibernateEmployeeRepository();
	
	
	public EmployeeService() {
		System.out.println("default");
		// TODO Auto-generated constructor stub
	}
	
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		System.out.println("parameterized constructer");
	this.employeeRepository = employeeRepository;
	}

	public List<Employee> getEmployees()
	{
		return employeeRepository.getEmployees();
	}



	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}



	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter");
		this.employeeRepository = employeeRepository;
	}

}
