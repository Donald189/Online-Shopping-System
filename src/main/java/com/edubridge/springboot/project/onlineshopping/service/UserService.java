package com.edubridge.springboot.project.onlineshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.entities.User;

@Service
public interface UserService {
	
	public User saveUser(User user);
	
	public List<User> getAllUser();
	
	public User getUserById(int userId);
	
	public User updateUser(int userId, User user);
	
	public void deleteUser(int userId);
	
	//public User getUserByemailId(String emailId);

	//public List<Products> getAllProducts();

	

}
