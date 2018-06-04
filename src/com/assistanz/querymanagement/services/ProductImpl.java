package com.assistanz.querymanagement.services;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assistanz.querymanagement.entities.Products;
import com.assistanz.querymanagement.repositories.AddProductToDB;
import com.assistanz.querymanagement.repositories.DeleteProductQuery;
import com.assistanz.querymanagement.repositories.FetchProducts;
import com.assistanz.querymanagement.repositories.MySQLConnection;
import com.assistanz.querymanagement.services.ProductService;
import java.io.IOException;

public class ProductImpl implements ProductService{
	
	// method to add new product by admin 
	public int addNewProduct(HttpServletRequest request, HttpServletResponse response, Products productsObject){
		
		response.setContentType("text/html");
		int result = 0;
		try{
		AddProductToDB addProductToDBObject = new AddProductToDB();
		result = addProductToDBObject.addProduct(productsObject);
		return result;
		}
		catch(SQLException e){
			System.out.println("SQL excpetion in adminHomeService");
			e.printStackTrace();
			return result;
			}
		}
	
	// method to delete individual product by admin user
	public int deleteProduct(HttpServletRequest request, HttpServletResponse response, Products productsObject){
		int result = 0;
		response.setContentType("text/html");

	
		DeleteProductQuery deleteProductQueryObject = new DeleteProductQuery();
		try{
		result = deleteProductQueryObject.deleteProduct(productsObject);
		}
		catch(SQLException e){
			System.out.println("SQl error in DeleteProductService");
		}
		return result;
	}
	
	public void getProducts(HttpServletRequest request, HttpServletResponse response)throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try{
		FetchProducts fetchProductsObject = new FetchProducts();
		ResultSet resultSet = fetchProductsObject.getProducts();
		ArrayList products=null;
		ArrayList productList =new ArrayList();
		while(resultSet.next())
		{
			products  = new ArrayList();
		
			products.add(resultSet.getInt(1));
			products.add(resultSet.getString(2));
			products.add(resultSet.getString(3));
			products.add(resultSet.getString(4));
			productList.add(products);
		}

		request.setAttribute("productList",productList);
		}
		catch(SQLException e){
			System.out.println("SQL excpetion in adminHomeService");
			e.printStackTrace();
		}
	}
	
	
	
}
