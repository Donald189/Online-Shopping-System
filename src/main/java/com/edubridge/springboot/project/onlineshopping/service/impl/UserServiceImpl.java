package com.edubridge.springboot.project.onlineshopping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.entities.User;
import com.edubridge.springboot.project.onlineshopping.exception.RecordNotFoundException;
import com.edubridge.springboot.project.onlineshopping.repository.ProductsRepository;
import com.edubridge.springboot.project.onlineshopping.repository.UserRepository;
import com.edubridge.springboot.project.onlineshopping.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(int userId) {
		return userRepo.findById(userId)
				.orElseThrow(() -> new RecordNotFoundException("User with "+userId+"Not Found"));
	}

	@Override
	public User updateUser(int userId, User user) {
		User u1 = getUserById(userId);
		u1.setUserPhone(user.getUserPhone());
		return userRepo.save(u1);
	}

	@Override
	public void deleteUser(int userId) {
		User user = getUserById(userId);
		userRepo.deleteById(userId);
		
	}

}
