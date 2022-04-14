package com.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.hibernate.bean.Teachers;

public class TeacherDAO {
	public void addTeacherDetails(int t_id,String t_name,String t_sub,String t_class)
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

			Teachers teach=new Teachers();
			
			//teach.setT_id(t_id);
			
			teach.setT_class(t_class);
			System.out.println(t_class);
			
			
			
			teach.setT_name(t_name);
			
			
			teach.setT_sub(t_sub);
			
			
			session.save(teach);
			
			transaction.commit();
			
			System.out.println("Teacher Details Added");
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("error");
			System.out.println("IN DAO Catch");
		}


	}
}
