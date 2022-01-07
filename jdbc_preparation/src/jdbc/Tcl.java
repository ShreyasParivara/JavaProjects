package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Tcl {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprep","root","hello");
			Statement statement = connection.createStatement();
			connection.setAutoCommit(false);
			statement.execute("insert into transation values('unlocking by finger print')");
			statement.execute("insert into transation values('entering the pin')");
			statement.execute("insert into transation values('check balance')");
			connection.commit();
	        Savepoint setSavepoint = connection.setSavepoint();
	        statement.execute("insert into transation values('debiting the amount')");
	        statement.execute("insert into transation values('transfer through network')");
	        statement.execute("insert into transation values('crediting the amount')");
	        connection.rollback(setSavepoint);
	       
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
