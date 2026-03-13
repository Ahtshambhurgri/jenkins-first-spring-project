package com.SpringMVCService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.SpringModel.User;
import com.SpringModelDao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public void createUserDao(User user) {
		this.userDao.save(user);
	}
}
