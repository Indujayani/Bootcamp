package com.indu.app.Ex1;
import com.indu.app.Ex1.model.Employee;
import com.indu.app.Ex1.repository.EmployeeRepository;
import com.indu.app.Ex1.repository.HibernateEmployeeRepository;
import com.indu.app.Ex1.service.EmployeeService;
import com.indu.app.Ex1.service.EmployeeServiceImp;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService= new EmployeeService();
		List<Employee> employees=employeeService.getEmployees();
			for(Employee employee :employees){
				
				System.out.println(employee.getName()+" from "+employee.getLocation());
				
			}


	}

}
