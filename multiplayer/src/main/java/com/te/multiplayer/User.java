package com.te.multiplayer;

import java.util.Scanner;


public class User {
	public static void main(String[] args) {
		int count = 1;
		
		Scanner scanner = new Scanner(System.in);
		Multiplayer multiplayer = new Multiplayer();
		do{
		System.out.println("choose the option you want");
		System.out.println("Search->1\nPlay->2\nAdd->3\nDelete->4\nDisplay Song->5\nExit->6");
		int option = scanner.nextInt();
		switch (option) {
		case 1:{
			multiplayer.search();
			break;
		}
		case 2:{
			multiplayer.play();
			break;
		}
		case 3:{
			multiplayer.add();
			break;
		}
		case 4:{
			multiplayer.delete();
			break;
		}
		case 5:{
			multiplayer.display();
			break;
		}
		case 6:{
			count=0;
			break;
		}
		default:
			System.out.println("Enter the correct option");
			break;
		}
		}while(count==1);
	}
}
