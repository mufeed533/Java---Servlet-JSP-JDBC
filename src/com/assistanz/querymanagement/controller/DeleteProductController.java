package com.assistanz.querymanagement.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assistanz.querymanagement.entities.Products;
import com.assistanz.querymanagement.services.ProductImpl;

/**
 * Servlet implementation class DeleteProductController
 */
@WebServlet("/deleteProductController/*")
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
			ProductImpl productServices = new ProductImpl();
			int result = 0;
			
			String str[] = request.getRequestURI().toString().split("/");
			int id = Integer.parseInt(str[3]);
			
			Products productsObject = new Products();
			productsObject.setId(id);
			result = productServices.deleteProduct(request, response, productsObject);
			
			if(result > 0)
			{
				response.sendRedirect("../productsHomeController");
			}
	}
}
