package com.te.onetomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prep");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		LaptopOneToMany laptop1 = new LaptopOneToMany();
		laptop1.setLid(101);
		laptop1.setLname("hp");
		LaptopOneToMany laptop2 = new LaptopOneToMany();
		laptop2.setLid(102);
		laptop2.setLname("lennovo");
		List<LaptopOneToMany> list = Arrays.asList(laptop1,laptop2);
		
		StudentOneToMany student1 = new StudentOneToMany();
		student1.setSid(1);
		student1.setSname("sam");
		student1.setList(list);
		
		laptop1.setStudent(student1);
		laptop2.setStudent(student1);
		
		
		
		
		transaction.begin();
		em.persist(laptop1);
		em.persist(laptop2);
		em.persist(student1);
		
		transaction.commit();
		
		
		
				

	}

}
