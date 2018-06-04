package com.assistanz.querymanagement.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assistanz.querymanagement.entities.Queries;
import com.assistanz.querymanagement.repositories.AddQuery;
import com.assistanz.querymanagement.repositories.FetchQueries;
import com.assistanz.querymanagement.repositories.MySQLConnection;

public class QueryImpl implements QueryService{
	public int addQuery(HttpServletRequest request, HttpServletResponse response, Queries queriesObject) throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// get the connection
		MySQLConnection MySQLConnection = new MySQLConnection();
		Connection connection = MySQLConnection.getConnection("UserQueries");
		
		// add user query
		int result = 0;
		
		try{
		AddQuery addQueryoObject = new AddQuery();
		result = addQueryoObject.addQuery(queriesObject);
		connection.close();
		System.out.println("Disconnected from database");
		}
		catch(SQLException e){
			System.out.println("SQL excpetion in userHomeService");
			e.printStackTrace();
		}
		finally{
			return result;
		}
	}
	public void getQueryRecords(HttpServletRequest request, HttpServletResponse response)throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try{
		FetchQueries fetchQueriesObject = new FetchQueries();
		ResultSet resultSet = fetchQueriesObject.getQueries();
		ArrayList collectedQueries = null;
		ArrayList queryList =new ArrayList();
		while(resultSet.next())
			{
			collectedQueries  = new ArrayList();
			
			collectedQueries.add(resultSet.getInt(1));
			collectedQueries.add(resultSet.getString(2));
			collectedQueries.add(resultSet.getString(3));
			collectedQueries.add(resultSet.getString(4));
			collectedQueries.add(resultSet.getString(5));
			queryList.add(collectedQueries);
			}

		request.setAttribute("queryList",queryList);
		}
		catch(SQLException e){
			System.out.println("SQL excpetion in adminHomeService");
			e.printStackTrace();
		}
		
	}
	
}
