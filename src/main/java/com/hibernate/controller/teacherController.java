package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.hibernate.dao.TeacherDAO;

public class teacherController extends HttpServlet{
	private static final long serialVersionId=1L;
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
	{
		
		String t_name=req.getParameter("t_name");
		String t_sub=req.getParameter("t_sub");
		String t_class=req.getParameter("t_class");



		HttpSession session=req.getSession(true);
		System.out.println(session);


		try {
			TeacherDAO teacherDAO=new TeacherDAO();
			teacherDAO.addTeacherDetails(0, t_name, t_class, t_sub);
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
