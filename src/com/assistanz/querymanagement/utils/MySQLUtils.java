package com.assistanz.querymanagement.utils;
import java.sql.Connection;

import com.assistanz.querymanagement.repositories.MySQLConnection;

public class MySQLUtils {
	public Connection connectToDB(String dbName){
		MySQLConnection MySQLConnection = new MySQLConnection();
		Connection connection = MySQLConnection.getConnection(dbName);
		return connection;
	}
}
