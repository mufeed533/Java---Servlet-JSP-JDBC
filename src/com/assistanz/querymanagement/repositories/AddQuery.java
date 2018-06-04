package com.assistanz.querymanagement.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import com.assistanz.querymanagement.entities.Queries;
import com.assistanz.querymanagement.utils.MySQLUtils;

public class AddQuery {
	public int addQuery(Queries queries) throws SQLException{
		
		MySQLUtils utilsObject =  new MySQLUtils();
		Connection mysqlConnection = utilsObject.connectToDB("UserQueries");
		System.out.println("Connected to UserQueries db");
		
		Statement st;
		String query = "insert into queries(first_name,last_name,email,query)"
				+" values(?,?,?,?)";
		PreparedStatement pstm = mysqlConnection.prepareStatement(query);
		pstm.setString(1,queries.getfirstName());
		pstm.setString(2,queries.getLastName());
		pstm.setString(3,queries.getEmail());
		pstm.setString(4,queries.getQuery());
		System.out.println("query" + pstm);
		int result = pstm.executeUpdate();
		return result;
	}
}
