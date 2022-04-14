package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.dao.LoginDAO;

public class loginController extends HttpServlet 
{

	//private static final long serialVersionId=1L;
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
	{
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		
		
		
		HttpSession session=req.getSession(true);
		
		
		try {
			LoginDAO loginDAO=new LoginDAO();
			loginDAO.addLoginDetails(userName, password);
			resp.sendRedirect("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
