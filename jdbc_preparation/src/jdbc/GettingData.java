package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class GettingData {
	public static void main(String[] args) {
		 Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprep", "root", "hello");
			Statement statement = connection.createStatement();
			
			ResultSet executeQuery = statement.executeQuery("select name from student where id=1");
			while(executeQuery.next()) {
				System.out.println(executeQuery.getString(1));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
	}

}
