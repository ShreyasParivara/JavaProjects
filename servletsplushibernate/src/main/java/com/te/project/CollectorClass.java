package com.te.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;




public class CollectorClass extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		String name = req.getParameter("uname");
		String password = req.getParameter("upass");
		writer.println("<h1>Logged in</h1>");
	
		Users user = new Users();
		user.setUsername(name);
		user.setPassword(password);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("data");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(user);
		transaction.commit();
		
	}	
		
	
	
	
}
