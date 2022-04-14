package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Success extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
	
		PrintWriter out = resp.getWriter();  
		resp.setContentType("text/html");  
		out.println("<script type=\"text/javascript\">");  
		out.println("alert('Details Sucesfully added')");  
		out.println("window.location='Home.jsp'");
		out.println("</script>");
		
        
	}
}
