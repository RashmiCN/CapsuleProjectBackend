package com.capsule.TaskTracker.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capsule.TaskTracker.entity.Task;
import com.capsule.TaskTracker.entity.User;
import com.capsule.TaskTracker.jdbc.UserDAO;

@Repository
public class UserRepository {

	@Autowired
	private UserDAO userDao;
	
	public List<User> getUserList() {
		return userDao.getUserList();
	}
	
	public boolean createUser(User user) {
		return userDao.insertUser(user);
	}

	public User getUser(int userId) {
		return userDao.getUser(userId);
	}

	public boolean deleteUser(int userId) {
		return userDao.deleteUser(userId);
	}

	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}
}
