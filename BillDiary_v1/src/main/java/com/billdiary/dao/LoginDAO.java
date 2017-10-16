package com.billdiary.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.billdiary.model.User;
import com.billdiary.utility.Constants;


@Repository
public class LoginDAO extends AbstractJpaDAO< User >{

	//final static Logger LOGGER = Logger.getLogger(LoginDAO.class);
	
//	@Autowired
//	EntityManagerFactory entityManagerFactory;
	
	
	public LoginDAO()
	{
		setClazz(User.class );
	}
	
	PreparedStatement st;
	ResultSet r1;
	Connection connection;
	public boolean doLogin(User user)
	{
	//	LOGGER.debug("In method LoginDAO:doLogin Entry ");
		boolean userLogged=true;
		
		/*
		try {
			Class.forName(Constants.DB_DRIVER);
			 connection = DriverManager.getConnection(Constants.DB_URL,Constants.DB_USERNAME,Constants.DB_PASSWORD);
			 st = connection.prepareStatement("select * from user");
		     r1=st.executeQuery();
		    while(r1.next())
			   {
				   System.out.println(r1.getString(2)+" "+r1.getString(3));
			   }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				r1.close();
				st.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		*/
		try {
		User u=findOne(1);
		if(null!=u)
		{
			System.out.println(u.toString());
			System.out.println(u.getUserName()+" "+u.getPassword());
		}
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		//LOGGER.debug("In method LoginDAO:doLogin Exit ");
		return userLogged;
		
	}
	
	
}
