package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;

public class InsertData {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","hello");
			statement= connection.createStatement();
			boolean execute = statement.execute("Insert into sweets values(101,'Mysorepak',10,1)");
			boolean execute1 = statement.execute("Insert into sweets values(101,'Mysorepak',10,1)");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
		}

	}

}
