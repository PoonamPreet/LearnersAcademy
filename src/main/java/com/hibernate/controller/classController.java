package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.dao.ClassDAO;
import com.hibernate.dao.LoginDAO;

public class classController extends HttpServlet {
	//private static final long serialVersionId=1L;
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
	{
		String class_name=req.getParameter("class_name");
		



		HttpSession session=req.getSession(true);


		try {
			ClassDAO classDAO=new ClassDAO();
			classDAO.addClassDetails(class_name);
			resp.sendRedirect("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}



	}


}
