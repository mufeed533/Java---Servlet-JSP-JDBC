package com.assistanz.querymanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assistanz.querymanagement.entities.Products;
import com.assistanz.querymanagement.services.ProductImpl;

@WebServlet("/addProductController")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			Products productsObject = new Products();
			productsObject.setName(request.getParameter("name").toString());
			productsObject.setDescription((request.getParameter("description").toString()));
			productsObject.setPrice((Integer.parseInt(request.getParameter("price"))));
			ProductImpl productServiceObject = new ProductImpl();
			
			int result = productServiceObject.addNewProduct(request, response, productsObject);
	        if(result > 0)
	        	response.sendRedirect("/QueryManagement/productsHomeController");
		}
	}

}
