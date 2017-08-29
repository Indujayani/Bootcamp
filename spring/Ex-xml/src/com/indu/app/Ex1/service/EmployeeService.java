package com.indu.app.Ex1.service;

import com.indu.app.Ex1.model.Employee;
import com.indu.app.Ex1.repository.EmployeeRepository;
import com.indu.app.Ex1.repository.HibernateEmployeeRepository;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements EmployeeServiceImp {
	EmployeeRepository employeeRepository;
	// =new HibernateEmployeeRepository();

	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeService(EmployeeRepository employeeRepository) {

		System.out.println("Constructo injected");
		this.employeeRepository = employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injected");
		this.employeeRepository = employeeRepository;
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}

}
