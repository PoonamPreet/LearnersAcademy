package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.hibernate.dao.StudentDAO;

public class studentController extends HttpServlet {
	private static final long serialVersionId=1L;
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
	{
		//int std_id=(Integer.parseInt(req.getParameter("std_id")));
		String class_name=req.getParameter("class_name");
		String sub_name=req.getParameter("sub_name");
		String std_name=req.getParameter("std_name");



		HttpSession session=req.getSession(true);
		System.out.println(session);


		try {
			StudentDAO studentDAO=new StudentDAO();
			studentDAO.addStudentDetails(0, class_name, sub_name, std_name);
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
