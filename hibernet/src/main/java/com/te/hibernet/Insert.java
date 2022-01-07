package com.te.hibernet;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Insert {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Team player1 = new Team();
		
//		int id=4;
//		String name="Sirj";
//		double salary=8000;
//		String designation="Bowler";
//		player1.setEmpid(id);
//		player1.setName(name);
//		player1.setSalary(salary);
//		player1.setDesignation(designation);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();//to commit the data
		
		transaction.begin();
	
		Query createQuery = em.createQuery("update Team set designation='Batsman' where name='virat'");
		
		createQuery.executeUpdate();
		transaction.commit();
		em.close();
		emf.close();
		//List resultList = createQuery.getResultList();
		
//		for(int i=0;i<resultList.size();i++) {
//			if("virat".equals(resultList.get(i))) {
//				System.out.println(resultList.get(i));
//				System.out.println("valid");
//			    break;
//			}
//			else {
//				System.out.println("invalid");
//				break;
//			}
		}
		

	}

