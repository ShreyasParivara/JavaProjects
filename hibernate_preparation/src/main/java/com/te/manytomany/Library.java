package com.te.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

public class Library {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prep");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Books book1 = new Books();
		book1.setBid(102);
		book1.setTitle("rich dad poor dad");
		Books book2 = new Books();
		book2.setBid(103);
		book2.setTitle("think and grow rich");
		
		Reader reader1 = new Reader();
		reader1.setName("ram");
		reader1.setRid(301);
		Reader reader2 = new Reader();
		reader2.setName("sam");
		reader2.setRid(302);
		
		List<Books> blist = Arrays.asList(book1,book2);
		List<Reader> rlist = Arrays.asList(reader1,reader2);
		book1.setReader(rlist);
		book2.setReader(rlist);
		reader1.setBook(blist);
		reader2.setBook(blist);
		
		transaction.begin();
		em.persist(reader2);
		em.persist(reader1);
		em.persist(book2);
		em.persist(book1);
		transaction.commit();
		
		
		
		
		
		
		
		
		

	}

}
