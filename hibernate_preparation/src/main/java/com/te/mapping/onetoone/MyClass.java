package com.te.mapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

public class MyClass {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prep");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		LaptopOneToOne lap1 = new LaptopOneToOne(101, "dell");
		LaptopOneToOne lap2 = new LaptopOneToOne(102, "hp");
		LaptopOneToOne lap3 = new LaptopOneToOne(103, "lenovo");
		StudentOneToOne std1 = new StudentOneToOne(201,"ram",lap1);
		StudentOneToOne std2 = new StudentOneToOne(202,"sam",lap2);
		StudentOneToOne std3 = new StudentOneToOne(203,"tom",lap3);
		transaction.begin();
		em.persist(std1);
		em.persist(std2);
		em.persist(std3);
		em.persist(lap1);
		em.persist(lap2);
		em.persist(lap3);
		transaction.commit();
		
	}

}
