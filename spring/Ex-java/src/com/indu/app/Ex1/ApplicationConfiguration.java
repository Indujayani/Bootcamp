package com.indu.app.Ex1;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.indu.app.Ex1.repository.*;
import com.indu.app.Ex1.service.*;

import com.indu.app.Ex1.service.EmployeeService;

@Configuration
@ComponentScan("com.indu")
@PropertySource("application.properties")
public class ApplicationConfiguration {

	@Bean(name = "employeeService")
	@Scope("singleton")
	public EmployeeServiceImp getEmployeeService() {
		EmployeeService employeeService = new EmployeeService();
		// employeeService.setEmployeeRepository(getEmployeeRepository());

		return employeeService;
	}

	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository() {

		return new HibernateEmployeeRepository();
	}

	public static PropertySourcesPlaceholderConfigurer getPropertyConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
