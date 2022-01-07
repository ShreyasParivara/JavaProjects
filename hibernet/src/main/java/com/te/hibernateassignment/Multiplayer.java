package com.te.hibernateassignment;



import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Multiplayer {
	private String song;
	private int count;

	Scanner scanner = new Scanner(System.in);
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("team");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	public void search() {
		System.out.println("Enter the song that you want to search");
		scanner.nextLine();
		song = scanner.nextLine();
		String query = "select songs from SongsList where song=:temp";
		Query createQuery = entityManager.createQuery(query);
		createQuery.setParameter("temp", song);
		List<SongsList> result = createQuery.getResultList();
		if (result.isEmpty()) {
			count = 0;
			System.out.println(song + " not found");
		} else {
			for (SongsList x : result) {
				System.out.println(x + " present ");
				count = 1;
			}

		}

	}

	public void play() {
		System.out.println("Enter the song that you want to Play");
		scanner.nextLine();
		song = scanner.nextLine();
		String query = "select songs from SongsList where song=:temp";
		Query createQuery = entityManager.createQuery(query);
		createQuery.setParameter("temp", song);
		List<SongsList> result = createQuery.getResultList();
		if (result.isEmpty()) {
			count = 0;
			System.out.println(song + " not found");
		} else {
			for (SongsList x : result) {
				System.out.println(x + " Playing.... ");
				count = 1;
			}

		}

	}

	public void add() {
		SongsList songslist = new SongsList();
		System.out.println("Enter the song that you want to Add");
		scanner.nextLine();
		song = scanner.nextLine();
		songslist.setSongs(song);
		transaction.begin();
		entityManager.persist(songslist);
		transaction.commit();
		System.out.println(song + " Added to list");

	}

	public void delete() {
		System.out.println("Enter the song that you want to delete");
		scanner.nextLine();
		song = scanner.nextLine();
		transaction.begin();
		SongsList songslist = entityManager.find(SongsList.class, song);
		entityManager.remove(songslist);
		transaction.begin();
		System.out.println(song + " Removed from the list");
	}

	public void display() {
		SongsList songslist = new SongsList();
		transaction.begin();
		Query createQuery = entityManager.createNamedQuery("select from");
		List<SongsList> result = createQuery.getResultList();
		System.out.println("==================");
		for (SongsList x : result) {
			System.out.println(x);
		}
		System.out.println("==================");

	}

}
