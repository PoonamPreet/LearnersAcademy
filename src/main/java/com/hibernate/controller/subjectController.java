package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JFrame;

import com.hibernate.dao.SubjectDAO;


public class subjectController extends HttpServlet{
	private static final long serialVersionId=1L;
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
	{

		String sub_name=req.getParameter("sub_name");
		String time=req.getParameter("time");
		String class_name=req.getParameter("class_name");



		HttpSession session=req.getSession(true);
		System.out.println(session);


		try {
			SubjectDAO subjectDAO=new SubjectDAO();
			subjectDAO.addSubjectDetails(0, sub_name, time, class_name);
			resp.sendRedirect("Success");
			System.out.println("In Controller TRy");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("In Controller catch");
		}

	}

}
