package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedSatement {

	public static void main(String[] args) {
		Connection connection;
		PreparedStatement statement;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprep", "root", "hello");

			statement = connection.prepareStatement("insert into student values(?,?)");
			
			statement.setInt(1, 2);
			
			statement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
