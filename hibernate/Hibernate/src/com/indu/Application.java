package com.indu;

import org.hibernate.Session;

import com.indu.hibernate.HibernateUtils;
import com.indu.model.AllocationHistory;
import com.indu.model.Employee;

import antlr.debug.NewLineEvent;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getSessionFactory().openSession();
		saveData(session);
		loadData(session);
		session.close();
	}
	
	private static void loadData(Session session){
		session.beginTransaction();
		Employee employee=(Employee)session.get(Employee.class,1);
	
		System.out.println(employee.getName()+" age " + employee.getAge());
		session.getTransaction().commit();
		
	}
	
	private static void saveData(Session session){
		
		System.out.println("open");
		session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("Indu");
		employee.setAge(50);
		employee.getAllocationData().setCity("kandy");
		employee.getAllocationData().setMobile("077");
		employee.getHistories().add(new AllocationHistory("p1", "aa"));
		session.save(employee);
		session.getTransaction().commit();
		System.out.println("saved");
	}
	

}
