package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbcprep?user=root&password=hello");
			Statement statement = connection.createStatement();
			statement.execute("create table student(id int,name varchar(40))");
			

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
