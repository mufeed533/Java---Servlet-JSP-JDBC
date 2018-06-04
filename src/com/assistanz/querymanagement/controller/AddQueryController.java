package com.assistanz.querymanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assistanz.querymanagement.entities.Queries;
import com.assistanz.querymanagement.services.QueryImpl;

/**
 * Servlet implementation class AddQueryController
 */
@WebServlet("/addQueryController")
public class AddQueryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QueryImpl queryServicesObject = new QueryImpl();
		int result = 0 ;
		Queries queriesObject =  new Queries();
		queriesObject.setFirstName(request.getParameter("first_name").toString());
		queriesObject.setLastName(request.getParameter("last_name").toString());
		queriesObject.setEmail(request.getParameter("first_name").toString());
		queriesObject.setQuery(request.getParameter("query").toString());
		result = queryServicesObject.addQuery(request, response, queriesObject);
		if(result>0)
		{	
			String message = "Your query has been sent!";
			request.getSession().setAttribute("message", message);
			response.sendRedirect("userHomeController");
		}
	}

}
