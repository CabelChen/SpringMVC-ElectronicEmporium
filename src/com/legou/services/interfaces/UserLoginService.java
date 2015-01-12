package com.legou.services.interfaces;

import com.legou.models.User;

public interface UserLoginService {
	public String customerLogin(User user);
	public String clerkLogin(User user);
	public String adminLogin(User user);
}
