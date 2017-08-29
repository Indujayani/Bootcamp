package com.indu.app.Ex1.service;
import com.indu.app.Ex1.model.Employee;
import com.indu.app.Ex1.repository.EmployeeRepository;
import com.indu.app.Ex1.repository.HibernateEmployeeRepository;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements EmployeeServiceImp {
	EmployeeRepository employeeRepository=new HibernateEmployeeRepository();
	public List<Employee> getEmployees()
	{
		return employeeRepository.getEmployees();
	}

}
