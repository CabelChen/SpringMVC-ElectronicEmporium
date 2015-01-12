package com.legou.dao.interfaces;

import com.legou.models.User;

public interface UserDao {
	public User addUser(User user);
	public User delUser(User user);
	public User findUser(User user);
}
