package com.tka.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.tka.entity.User;
import com.tka.service.LoginService;

public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);
		
		LoginService service = new LoginService();
	    boolean answer = service.validate(user);
	    
	    String webpage;
	    String data;
	    
	    if(answer) {
	    	webpage = "welcome.jsp";
	    	data = "welcome " + user.username;
	    }
	    else {
	    	webpage = "login.jsp";
	    	data = "Wrong Credentials";
	    }
	    
		RequestDispatcher rd = request.getRequestDispatcher(webpage);
		request.setAttribute("message",data);
		
		rd.forward(request, response);
	
	}

}
