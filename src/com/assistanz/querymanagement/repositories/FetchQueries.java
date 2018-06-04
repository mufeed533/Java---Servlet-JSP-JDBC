package com.assistanz.querymanagement.repositories;
import java.sql.ResultSet;
import java.sql.Statement;

import com.assistanz.querymanagement.utils.MySQLUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class FetchQueries {
	public ResultSet getQueries()throws SQLException{
		
		MySQLUtils utilsObject =  new MySQLUtils();
		Connection mysqlConnection = utilsObject.connectToDB("UserQueries");
		System.out.println("Connected to UserQueries db");
		
		Statement st;
		ResultSet resultSet = null;
		String query = "select * from queries order by query_id";
		System.out.println("query " + query);
		st = mysqlConnection.createStatement();
		resultSet = st.executeQuery(query);
		return resultSet;
	}
}
