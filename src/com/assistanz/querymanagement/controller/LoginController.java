package com.assistanz.querymanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.assistanz.querymanagement.services.LoginService;
import com.assistanz.querymanagement.entities.Users;

@WebServlet(name = "LoginController", urlPatterns = { "/loginPageController" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        HttpSession session = request.getSession();
        
        LoginService loginService = new LoginService();
        Users users = new Users();
        users.setUserName(request.getParameter("username"));
        users.setPassword(request.getParameter("password"));
        String user = loginService.authenticate(request,response, users ,session);
   
        if(user != null){
        	response.sendRedirect(request.getContextPath() + "/"+user+"HomeController");
        }
        else {
            // If invalid user show error message
            RequestDispatcher rd = request
                    .getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
        
	}
}
