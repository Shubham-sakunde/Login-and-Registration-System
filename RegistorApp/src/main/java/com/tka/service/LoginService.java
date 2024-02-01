package com.tka.service;

import com.tka.dao.UserDAO;
import com.tka.entity.User;

public class LoginService {

	public boolean validate(User userFromBrowser) {

		UserDAO dao = new UserDAO();

		User userFromDB = dao.getUser(userFromBrowser.username);
		
		if(userFromDB != null) {
			
			if (userFromBrowser.username.equals(userFromDB.username)
					&& userFromBrowser.password.equals(userFromDB.password)) {
				return true;
			} else {
				return false;
			}
			
		}else {
			return false;
		}

		
	}

}
