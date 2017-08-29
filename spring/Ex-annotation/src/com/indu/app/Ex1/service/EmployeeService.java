package com.indu.app.Ex1.service;
import com.indu.app.Ex1.model.Employee;
import com.indu.app.Ex1.repository.EmployeeRepository;
import com.indu.app.Ex1.repository.HibernateEmployeeRepository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("employeeServiceImp")
public class EmployeeService implements EmployeeServiceImp {

	public EmployeeService() {
		System.out.println("constructer");
	}
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		System.out.println("ol Constructer");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	@Autowired

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setters");
		this.employeeRepository = employeeRepository;
	}

	
	EmployeeRepository employeeRepository;
//	=new HibernateEmployeeRepository();
	
	public List<Employee> getEmployees()
	{
		return employeeRepository.getEmployees();
	}

}
