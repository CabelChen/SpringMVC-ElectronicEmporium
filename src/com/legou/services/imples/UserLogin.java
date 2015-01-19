package com.legou.services.imples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legou.dao.impl.UserDaoImpl;
import com.legou.models.User;
import com.legou.services.interfaces.UserLoginService;
@Service
public class UserLogin implements UserLoginService {
	@Autowired
	private UserDaoImpl userDaoImpl;
	@Override
	public String customerLogin(User user) {
		userDaoImpl.addUser(user);
		System.out.println("customerLogin");
		return null;
	}

	@Override
	public String clerkLogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String adminLogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
