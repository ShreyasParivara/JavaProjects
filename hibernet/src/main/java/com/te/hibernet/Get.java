package com.te.hibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Get {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");
		EntityManager em = emf.createEntityManager();
		Team player = em.find(Team.class,2);//to get the data
		System.out.println(player);//we have to override to string method
		

	}

}
