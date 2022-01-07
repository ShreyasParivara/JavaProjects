import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchStatement {

	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection =null;
		Statement statement =null;
		FileReader filereader;
		try {
			filereader = new FileReader("C:\\\\Users\\\\shreyas\\\\Desktop\\\\dbcred\\\\dbread.txt");
			Properties properties = new Properties();
			properties.load(filereader);
			connection = DriverManager.getConnection(url,properties);
			statement = connection.createStatement();
			statement.addBatch("insert into employees values(101,'kumar')");
			statement.addBatch("insert into employees values(102,'manju')");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
