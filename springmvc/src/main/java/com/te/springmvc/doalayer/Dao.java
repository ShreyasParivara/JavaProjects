package com.te.springmvc.doalayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.te.springmvc.model.Register;

@Component
public class Dao {
	
	public void put(Register reg) {
		try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("springs");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(reg);
		transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
