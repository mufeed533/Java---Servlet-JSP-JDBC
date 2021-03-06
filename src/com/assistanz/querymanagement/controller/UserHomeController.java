package com.assistanz.querymanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.assistanz.querymanagement.services.ProductImpl;

/**
 * Servlet implementation class UserHomeController
 */
@WebServlet("/userHomeController")
public class UserHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductImpl productServices = new ProductImpl();
		productServices.getProducts(request, response);
        String nextJSP = "/userHome.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
	}

}
