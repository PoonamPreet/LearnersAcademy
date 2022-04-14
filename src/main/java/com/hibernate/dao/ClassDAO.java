package com.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Classes;
import com.hibernate.bean.Login;

public class ClassDAO {
	public void addClassDetails(String classname)
	{
		try {
			//configure hibernate
			Configuration config=new Configuration().configure();


			//create session factory

			SessionFactory sessionfactory=config.buildSessionFactory();

			//getting session object
			Session session=sessionfactory.openSession();

			//starting Transaction
			Transaction transaction=session.beginTransaction(); 

			Classes classes=new Classes();
			
			
			classes.setClass_name(classname);
			
			session.save(classes);
			
			transaction.commit();
			
			System.out.println("Details Added");
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}

}
