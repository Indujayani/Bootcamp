package com.indu.app.Ex1;
import com.indu.app.Ex1.model.Employee;
import com.indu.app.Ex1.repository.EmployeeRepository;
import com.indu.app.Ex1.repository.HibernateEmployeeRepository;
import com.indu.app.Ex1.service.EmployeeService;
import com.indu.app.Ex1.service.EmployeeServiceImp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EmployeeService employeeService= new EmployeeService();

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeServiceImp employeeService=applicationContext.getBean("employeeServiceImp",EmployeeServiceImp.class);
		
		List<Employee> employees=employeeService.getEmployees();
			for(Employee employee :employees){
				
				System.out.println(employee.getName()+" from "+employee.getLocation());
				
			}


	}

}
