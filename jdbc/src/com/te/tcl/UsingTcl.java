package com.te.tcl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class UsingTcl {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		Savepoint setSavepoint=null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","hello");
			statement = connection.createStatement();
			connection.setAutoCommit(false);
			statement.execute("insert into trans values(1,'unlocking by fingerprint')");
			statement.execute("insert into trans values(2,'entering the pin')");
			statement.execute("insert into trans values(3,'check balance')");
			System.out.println("Balance is 1000000");
			setSavepoint=connection.setSavepoint();
			statement.execute("insert into trans values(4,'debiting the amount')");
			statement.execute("insert into trans values(5,'transfer through network')");
			statement.execute("insert into trans values(6,'crediting the amount')");
			System.out.println("Transacton completed.........");
			connection.commit();
			
		} catch (SQLException e) {
			
			try {
				connection.rollback(setSavepoint);
				connection.commit();
			} catch (SQLException e1) {
				System.out.println("Transaction failed");
			}
		}
		
	}

}
