package com.assistanz.querymanagement.services;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assistanz.querymanagement.entities.Products;

public interface ProductService {
	
	// method to add new product
	public int addNewProduct(HttpServletRequest request, HttpServletResponse response, Products productsObject);
	
	// method to delete a product
	public int deleteProduct(HttpServletRequest request, HttpServletResponse response, Products productsObject);
	
	// method to get products 
	public void getProducts(HttpServletRequest request, HttpServletResponse response)throws IOException;
}
