package com.indu.app.Ex1.repository;



import com.indu.app.Ex1.model.Employee;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;


public class HibernateEmployeeRepository implements EmployeeRepository {
	
	@Autowired
	Environment environment;
//	

//	
	@Value("${city}")
	String city;
	
	
	@Override
	public List<Employee> getEmployees()
	{
		String name = environment.getProperty("name");
		List<Employee> employees=new ArrayList<>();
		Employee employee=new Employee();
		employee.setName(name);
		employee.setLocation(city);
		employees.add(employee);
		return employees;
		
	}
			
			

}
