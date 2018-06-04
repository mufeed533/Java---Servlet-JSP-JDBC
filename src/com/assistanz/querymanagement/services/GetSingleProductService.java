package com.assistanz.querymanagement.services;

import java.sql.Connection;
import java.sql.SQLException;


import com.assistanz.querymanagement.repositories.MySQLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.assistanz.querymanagement.repositories.FetchSingleProduct;
import java.sql.ResultSet;

public class GetSingleProductService {
	public void getProductDetails(HttpServletRequest request, HttpServletResponse response){
		ResultSet result = null;
		response.setContentType("text/html");
		MySQLConnection MySQLConnection = new MySQLConnection();
		Connection connection = MySQLConnection.getConnection("products");	
		String str[] = request.getRequestURI().toString().split("/");
		int id = Integer.parseInt(str[3]);
		FetchSingleProduct fetchSingleProductObject = new FetchSingleProduct();
		try{
		result = fetchSingleProductObject.getIndividualProduct(connection, id);
		request.setAttribute("singleProduct", result);
		connection.close();
		System.out.println("Disconnected from database");
		}
		catch(SQLException e){
			System.out.println("SQl error in GetSingleProductService");
		}
	}
}
