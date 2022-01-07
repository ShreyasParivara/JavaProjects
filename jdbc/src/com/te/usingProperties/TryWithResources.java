package com.te.usingProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResources {

	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=hello");
				Statement stm = con.createStatement();){
				boolean execute = stm.execute("alter table sweets rename champa");
				System.out.println(execute);
				} catch (SQLException e) {
					e.printStackTrace();
				}


	}

}
