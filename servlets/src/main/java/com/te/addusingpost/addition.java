package com.te.addusingpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addition extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		int value1=Integer.parseInt(req.getParameter("first"));
		int value2=Integer.parseInt(req.getParameter("second"));
		writer.println("<h1>sum: "+(value1+value2)+"</h1>");
		
	}
	

}
