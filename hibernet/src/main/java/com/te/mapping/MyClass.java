package com.te.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class MyClass {

	public static void main(String[] args) {
		Girl girl = new Girl();
		Boy boy = new Boy();
		
		girl.setGid(1);
		girl.setName("ash");
		girl.setB(boy);
		
		boy.setBid(101);
		boy.setName("AbhiShek");
		boy.setGirl(girl);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		em.persist(girl);
		em.persist(boy);
		transaction.begin();
		transaction.commit();
		

	}

}
