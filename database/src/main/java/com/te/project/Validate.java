package com.te.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String name = req.getParameter("uname");
		String password = req.getParameter("upass");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("data");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		String query = "select username from Users where password=:pass";
		transaction.begin();
		Query createquery = em.createQuery(query);
		createquery.setParameter("pass", password);
		Object singleResult=null;
		try {
			singleResult = createquery.getSingleResult();
		} catch (NoResultException e) {
			writer.println("<h1>Invalid credentials</h1>");
		}

		if (singleResult.equals(name)) {
			resp.sendRedirect("./home.html");
		} else {
			writer.println("<h1>Invalid Credentials</h1>");
		}

		transaction.commit();

	}
}
