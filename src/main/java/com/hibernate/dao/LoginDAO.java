package com.hibernate.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Login;

public class LoginDAO 
{

	public void addLoginDetails(String username,String password)
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

			Login login=new Login();
			
			
			
			
			login.setUsername(username);
			
			login.setPassword(password);
			
			session.save(login);
			
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
