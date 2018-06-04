package com.assistanz.querymanagement.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.assistanz.querymanagement.entities.Products;
import com.assistanz.querymanagement.utils.MySQLUtils;

public class AddProductToDB{
	public int addProduct(Products product)throws SQLException{
		
		MySQLUtils utilsObject =  new MySQLUtils();
		Connection mysqlConnection = utilsObject.connectToDB("products");
		System.out.println("Connected to products db");
		
		System.out.println("Connected to products db");
		String query = "insert into product_info(name,description,price)"
				+"values(?,?,?)";
		PreparedStatement preparedStatement = mysqlConnection.prepareStatement(query);
		preparedStatement.setString(1, product.getName());
		preparedStatement.setString(2,product.getDescription());
		preparedStatement.setInt(3,product.getPrice());
		System.out.println("query " + query);
	    int result = preparedStatement.executeUpdate();
		return result;
	}
}
