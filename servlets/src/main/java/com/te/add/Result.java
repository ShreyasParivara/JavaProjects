package com.te.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Result extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		String value1=req.getParameter("first");
		String value2=req.getParameter("second");
		int number1=Integer.parseInt(value1);
		int number2=Integer.parseInt(value2);
		writer.println("<h1>sum: "+(number1+number2)+"</h1>");
		
		
	}

}
