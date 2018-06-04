package com.assistanz.querymanagement.repositories;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.assistanz.querymanagement.entities.Products;
import com.assistanz.querymanagement.utils.MySQLUtils;

public class DeleteProductQuery {
	public int deleteProduct(Products productsObject)throws SQLException{
		
		MySQLUtils utilsObject =  new MySQLUtils();
		Connection mysqlConnection = utilsObject.connectToDB("products");
		System.out.println("Connected to products db");
		
		String query = "delete from product_info where id ="+productsObject.getId();
		System.out.println("query " + query);
		
		Statement statement = mysqlConnection.createStatement();
        
	    int result = statement.executeUpdate(query);
		return result;
	}
}
