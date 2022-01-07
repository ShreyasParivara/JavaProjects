package com.te.oneToMany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {

	public static void main(String[] args) {
		Girls girl = new Girls();
		girl.setGid(420);
		girl.setName("Ash");
		
		Boys boy1 = new Boys();
		boy1.setBid(1);
		boy1.setName("Vivek");
		boy1.setBalance(100);
		Boys boy2 = new Boys();
		boy2.setBid(2);
		boy2.setName("Selmon");
		boy2.setBalance(200);
		Boys boy3 = new Boys();
		boy3.setBid(3);
		boy3.setName("Abhishek");
		boy3.setBalance(300);
		
		List<Boys> listofboys = Arrays.asList(boy1,boy2,boy3);
		girl.setBoys(listofboys);
		
		boy1.setGirl(girl);
		boy2.setGirl(girl);
		boy3.setGirl(girl);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("map");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(girl);
		em.persist(boy1);
		em.persist(boy2);
		em.persist(boy3);
		transaction.commit();
		

	}

}
