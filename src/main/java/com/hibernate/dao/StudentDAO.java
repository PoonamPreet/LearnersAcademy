package com.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.hibernate.bean.Student;

public class StudentDAO {
	public void addStudentDetails(int std_id,String class_name,String sub_name,String std_name)
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

			Student student=new Student();
			
			//student.setClass_id(class_id);
			student.setClass_name(class_name);
			System.out.println(class_name);
			
			student.setStd_name(std_name);
			System.out.println(std_name);
			student.setSub_name(sub_name);
			System.out.println(sub_name);
			session.save(student);
			
			transaction.commit();
			
			System.out.println("Student Details Added");
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("error");
			System.out.println("IN DAO Catch");
		}

	}


}
