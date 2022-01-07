



package com.te.hibernet;

import java.sql.DriverManager;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");//accept persistance unit
		EntityManager em = emf.createEntityManager();
//		String query= "from Team";//where clause can also be written
//		Query createQuery=em.createQuery(query);
//		List<Team>result = createQuery.getResultList();
//		for(Team team:result) {
//			System.out.println(team);
//		}
//		String query1 = "select min(salary) from Team";
//		Query createQuery = em.createQuery(query1);
//		double result = (double) createQuery.getSingleResult();
//		System.out.println(result);

		EntityTransaction transaction = em.getTransaction();
		String query2 = "update Team set salary=:sal where empid=:od";//place holders
		transaction.begin();
		Query createQuery2 = em.createQuery(query2);
	    createQuery2.setParameter("sal", 2000.0);
	    createQuery2.setParameter("od", 2);
	    createQuery2.executeUpdate();
	    transaction.commit();
//		int result2 = createQuery2.executeUpdate();
//		transaction.commit();
//		
//		String query3 = "delete from Team where empid=5";
//		transaction.begin();
//		Query createQuery3 = em.createQuery(query3);
//		int result3 = createQuery3.executeUpdate();
//		transaction.commit();

	}

}
