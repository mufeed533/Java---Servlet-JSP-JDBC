package com.assistanz.querymanagement.services;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.assistanz.querymanagement.controller.LoginController;
import javax.servlet.http.HttpSession;
import com.assistanz.querymanagement.entities.Users;

public class LoginService {
	public String authenticate(HttpServletRequest request,
            HttpServletResponse response, Users users,HttpSession session){
		  	
	        String user = null;
	        if (users.getUserName().equals("admin") && users.getPassword().equals("admin")) {
	            session.setAttribute("username", users.getUserName());
	            session.setAttribute("userId", 2);
	            user = "admin";
	            return user;
	        }
	        else if(users.getUserName().equals("user") && users.getPassword().equals("user")){
	        	session.setAttribute("username", users.getUserName());
	            session.setAttribute("userId", 1);
	            user = "user";
	            return user;
	        }
	        else {
	            // If invalid user show error message
	            request.setAttribute("errorMsg", "Invalid Authentication");
	            return user;
		}
	}
}
