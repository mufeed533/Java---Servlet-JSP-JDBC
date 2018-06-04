package com.assistanz.querymanagement.repositories;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class FetchSingleProduct {
	public ResultSet getIndividualProduct(Connection mysqlConnection, int id) throws SQLException{
		Statement st;
		ResultSet resultSet = null;
		String query = "select * from product_info where id="+id;
		System.out.println("query " + query);
		st = mysqlConnection.createStatement();
		resultSet = st.executeQuery(query);
		return resultSet;
	}
}
