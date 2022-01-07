package com.te.insertion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prep");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		Query createQuery = em.createQuery("update Cars set name=:n where id=:i");
		createQuery.setParameter("n","BMW");
		createQuery.setParameter("i",2);
		
		
		createQuery.executeUpdate();
		transaction.commit();
		
		
		

	}

}
