package com.te.storedProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection = null;
		CallableStatement callstatement = null;
		Scanner sc = new Scanner(System.in);
		try {
			connection =DriverManager.getConnection(url,"root","hello");
			callstatement = connection.prepareCall("call put(?,?,?,?)");
			//taking input from the user
			while(true) {
				System.out.println("Enter the id of the sweet");
				int id = sc.nextInt();
				if(id ==0) {
					break;
				}
				System.out.println("Enter the sweet name");
				String name = sc.next();
				System.out.println("Enter the cost of the sweet");
				double cost = sc.nextDouble();
				System.out.println("Enter the quantity of the sweet");
				int qty  = sc.nextInt();
				//assigning the value  to table
				callstatement.setInt(1, id);
				callstatement.setString(2, name);
				callstatement.setDouble(3, cost);
				callstatement.setInt(4, qty);
				callstatement.execute();
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
			
		}

	}


