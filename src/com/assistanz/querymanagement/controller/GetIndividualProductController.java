package com.assistanz.querymanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.assistanz.querymanagement.services.GetSingleProductService;

/**
 * Servlet implementation class GetIndividualProductController
 */
@WebServlet("/GetIndividualProductController")
public class GetIndividualProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GetSingleProductService GetSingleProductService = new GetSingleProductService();
		GetSingleProductService.getProductDetails(request, response);
		String nextJSP = "/editProduct.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
	}
}
