package com.SpringModelDao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SpringModel.User;

@Repository
public class UserDao {
	@Autowired
	public SessionFactory sessionFactory;
	@Transactional
	public void save(User user) {
		this.sessionFactory.getCurrentSession().persist(user);
		System.out.println("Data Added To the DataBase");
	}
}
