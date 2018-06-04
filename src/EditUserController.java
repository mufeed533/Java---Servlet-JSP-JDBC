

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.*;
import java.sql.*;
import java.util.*;


public class EditUserController extends HttpServlet{ 
	private static final long serialVersionUID = 1L;

   public void doGet(HttpServletRequest request, HttpServletResponse response)
                                   throws ServletException,IOException{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			System.out.println("MySQL Connect Example.");
			Connection conn = null;
			String url = "jdbc:mysql://localhost:3306/";
			String dbName = "user_register";
			String driver = "com.mysql.jdbc.Driver";
			String userName = "root"; 
			String password = "l3tm3in";

			out.println(request.getRequestURI());
			out.println(request.getParameter("id"));
			String str[] = request.getRequestURI().toString().split("/");
			int userId = Integer.parseInt(str[3]);
			
			if(userId >= 0)
			{

            int id = Integer.parseInt(request.getParameter("id").toString());
			String username = request.getParameter("username").toString();
			String first_name = request.getParameter("first_name").toString();
			String userpass = request.getParameter("password").toString();
			String last_name = request.getParameter("last_name").toString();
			String city = request.getParameter("city").toString();
			String state = request.getParameter("state").toString();
			String country = request.getParameter("country").toString();
		
			
			Statement stmt;
			try {
				Class.forName(driver).newInstance();
				conn = DriverManager.getConnection(url+dbName,userName,password);
				System.out.println("Connected to the database");
				
				ArrayList al=null;
				ArrayList userList =new ArrayList();
				String query = "update userregister set username='"+username+"',password='"+userpass+"',first_name='"+first_name+"',last_name='"+last_name+"',city='"+city+"',state='"+state+"',country='"+country+"' where id="+id;
				stmt = conn.createStatement();
            
			    int i = stmt.executeUpdate(query);
				System.out.println("query" + query);
				if(i>0)
				{
					response.sendRedirect("servletRecord");
				}
				conn.close();
				System.out.println("Disconnected from database");
			} catch (Exception e) {
			e.printStackTrace();
			}
		 }
	  }
}