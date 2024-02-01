package com.tka.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.tka.entity.User;
import com.tka.service.UserService;


public class RegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Long mobno = Long.parseLong(request.getParameter("mobno"));
		String emailid = request.getParameter("emailid");
		
		UserService service = new UserService();
		
		User user = new User();
		
		
		user.setUsername(username);
		user.setPassword(password);
		user.setMobno(mobno);
		user.setEmailid(emailid);
		
		service.saveToDataBase(user);
		
		request.setAttribute("message","Registration Successful. plz login now");
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		
		rd.forward(request,response);
		
	}


}
