package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		Statement statement=null;
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprep","root","hello");
			statement=connection.createStatement();
			
			boolean execute = statement.execute("update student set name='vivek' where id=1 ");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			if(connection!=null) {
				try {
					connection.close();
					}
				 catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		
				
				if(statement!=null) {
					try {
						statement.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
				}
			
		}
	}
}

				
			
			
		
		
		


