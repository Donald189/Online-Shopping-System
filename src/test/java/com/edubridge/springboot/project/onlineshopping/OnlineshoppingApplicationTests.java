package com.edubridge.springboot.project.onlineshopping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edubridge.springboot.project.onlineshopping.entities.User;
import com.edubridge.springboot.project.onlineshopping.repository.UserRepository;

@SpringBootTest
class OnlineshoppingApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	UserRepository userRepo;

	@Test
	public void testCreateUser() {
	User user = new User();
	user.setFirstName("Balaji");
	user.setLastName("S");
	user.setUserPhone("7899541356");
	User saveUser = userRepo.save(user);
	}

}
