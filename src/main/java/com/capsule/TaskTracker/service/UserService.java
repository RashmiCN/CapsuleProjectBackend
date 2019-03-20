package com.capsule.TaskTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsule.TaskTracker.entity.ParentTask;
import com.capsule.TaskTracker.entity.Task;
import com.capsule.TaskTracker.entity.User;
import com.capsule.TaskTracker.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getTasks(){
//		System.out.println("get tasks");
		return userRepository.getUserList();
	}
	// create User
	public boolean createUser(User user) {
		return userRepository.createUser(user);
	}
	
	// get requested user	
	public User getUser(int id) {
		return userRepository.getUser(id);
	}
	
	// delete user	
	public boolean deleteUser(int id) {
		return userRepository.deleteUser(id);
	}
	
	// Update user	
	public boolean updateUser(User user) {
		return userRepository.updateUser(user);
	}


}
