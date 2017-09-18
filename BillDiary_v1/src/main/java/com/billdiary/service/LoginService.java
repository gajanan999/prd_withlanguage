package com.billdiary.service;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billdiary.dao.LoginDAO;
import com.billdiary.model.User;


@Service
public class LoginService {
	
	//final static Logger LOGGER = Logger.getLogger(LoginService.class);
	
	@Autowired
	public LoginDAO loginDAO;
	
	public boolean doLogin(User user)
	{
		//LOGGER.debug("In method LoginService:doLogin Entry ");
		boolean userLogged=false;
		
		if(loginDAO.doLogin(user))
		{
			userLogged=true;
		}else {
			userLogged=false;
		}
		
		//LOGGER.debug("In method LoginService:doLogin Exit ");
		return userLogged;
		
	}

}
