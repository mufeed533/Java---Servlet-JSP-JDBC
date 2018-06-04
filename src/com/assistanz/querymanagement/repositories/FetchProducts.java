package com.assistanz.querymanagement.repositories;
import java.sql.ResultSet;
import java.sql.Statement;

import com.assistanz.querymanagement.utils.MySQLUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class FetchProducts{
	public ResultSet getProducts()throws SQLException{
		
		MySQLUtils utilsObject =  new MySQLUtils();
		Connection mysqlConnection = utilsObject.connectToDB("products");
		System.out.println("Connected to products db");
		
		Statement st;
		ResultSet resultSet = null;
		String query = "select * from product_info order by id";
		System.out.println("query " + query);
		st = mysqlConnection.createStatement();
		resultSet = st.executeQuery(query);
		return resultSet;
	}
}
