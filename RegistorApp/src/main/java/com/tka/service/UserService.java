package com.tka.service;

import com.tka.dao.UserDAO;
import com.tka.entity.User;

public class UserService {
	
	public void saveToDataBase(User user) {
		
		UserDAO dao = new UserDAO();
		
		dao.saveToDataBase(user);
		
	}
	
}
