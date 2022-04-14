package com.hibernate.dao;

import javax.security.auth.Subject;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Subjects;

import com.hibernate.controller.subjectController;

public class SubjectDAO {
	public void addSubjectDetails(int sub_id,String sub_name,String time,String class_name)
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

			Subjects sub=new Subjects();
			
			sub.setClass_name(class_name);
			sub.setSub_name(sub_name);
			sub.setTime(time);
			
			
			
			session.save(sub);
			
			transaction.commit();
			
			System.out.println("Subject Details Added");
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("error");
			System.out.println("IN DAO Catch");
		}


	}

}
