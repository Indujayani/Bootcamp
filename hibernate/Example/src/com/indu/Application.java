package com.indu;

import org.hibernate.Session;

import com.indu.example.HibernateUtils;

import com.indu.model.Employee;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getSessionFactory().openSession();
		System.out.println("open");
		session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("Indu");
		employee.setAge(50);
		employee.setCity("colombo");
		
//		employee.getAllocationData().setCity("kandy");
//		employee.getAllocationData().setMobile("077");
//		employee.getHistories().add(new AllocationHistory("p1", "aa"));
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}

}
