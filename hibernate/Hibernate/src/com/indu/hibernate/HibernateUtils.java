package com.indu.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {

	private static SessionFactory factory;
	private static ServiceRegistry registry;
	
	
	static{
		
		try{
			
		Configuration configuration =new Configuration().configure();
		registry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

		factory=configuration.buildSessionFactory(registry);
		
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return factory;
	}
}
