package br.com.marino.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		try  {
			return DriverManager.getConnection("jdbc:mysql://localhost/test", 
					"developer", 
					"devadmin");
		} catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	}
}
