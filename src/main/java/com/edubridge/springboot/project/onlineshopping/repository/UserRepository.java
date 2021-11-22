package com.edubridge.springboot.project.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.springboot.project.onlineshopping.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	//User getUserByemailId(String emailId);

}
