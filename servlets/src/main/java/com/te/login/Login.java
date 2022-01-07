package com.te.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		String parameter = req.getParameter("uname");
		writer.println("<h1>Welcome"+parameter+"</h1><br>");
		String parameter2 = req.getParameter("upass");
		writer.println("<h1>your password is"+parameter2+"</h1><br>");
		String[] parametrvalues = req.getParameterValues("sports");
	    for (int i = 0; i < parametrvalues.length; i++) {
			writer.println(parametrvalues[i]);
		}
		
		
	}

}
