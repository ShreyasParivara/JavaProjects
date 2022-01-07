package com.te.hibernet;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		/*
		 * deleting the data
		 */
		Team vk = em.find(Team.class,6);
		transaction.begin();
		em.remove(vk);
		transaction.commit();
		/*
		 * Updating the data
		 */
		Team kl = em.find(Team.class, 5);
		if(kl!=null) {
			kl.setDesignation("bowler");
			transaction.begin();
			transaction.commit();
			
		}

	}

}
