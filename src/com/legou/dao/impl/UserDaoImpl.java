package com.legou.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.legou.dao.interfaces.UserDao;
import com.legou.models.User;
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		System.out.println("添加成功");
		return user;
	}

	@Override
	public User delUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
