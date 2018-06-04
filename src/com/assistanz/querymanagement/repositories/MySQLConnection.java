package com.assistanz.querymanagement.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySQLConnection {
	
	private String url = "jdbc:mysql://localhost:3306/";
	private String driver = "com.mysql.jdbc.Driver";
	private String userName = "root"; 
	private String password = "l3tm3in";
	private Connection connection = null;
	
	// method to create a connection 
	public Connection getConnection(String dbName){
		try{
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(url+dbName,userName,password);
			System.out.println("Connected to the database");
		}
		catch(Exception e){
			System.out.println("SQLexcpetion in MYSQLCOnnection");
			e.printStackTrace();
		}
		return connection;
		}
}
