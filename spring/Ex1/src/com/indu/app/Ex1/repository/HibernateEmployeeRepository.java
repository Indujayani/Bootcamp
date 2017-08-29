package com.indu.app.Ex1.repository;



import com.indu.app.Ex1.model.Employee;

import java.util.ArrayList;
import java.util.List;


public class HibernateEmployeeRepository implements EmployeeRepository {
	@Override
	public List<Employee> getEmployees()
	{
		List<Employee> employees=new ArrayList<>();
		Employee employee=new Employee();
		employee.setName("Indu");
		employee.setLocation("Colombo");
		employees.add(employee);
		return employees;
	}
			
			

}
