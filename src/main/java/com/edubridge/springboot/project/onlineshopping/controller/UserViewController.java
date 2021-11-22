package com.edubridge.springboot.project.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edubridge.springboot.project.onlineshopping.entities.User;
import com.edubridge.springboot.project.onlineshopping.service.UserService;

@Controller
public class UserViewController {
	
	@Autowired
	UserService userService;
	
	//To view users
	@RequestMapping("/users")
	public String viewUserIndexPage(Model model) {
		List<User> userList = userService.getAllUser();
		model.addAttribute("userList", userList);
		return "user_index";
	}
	
	//To add new User
	@RequestMapping("/new")
	public String viewNewUserPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "new_user";
	}
	
	//To Save new User
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/users";
	}
	
	//To edit user
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditUserPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_user");
		User user = userService.getUserById(id);
		mav.addObject("user",user);
		return mav;
	}
	
	//To delete user
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable(name = "id") int id) {
		userService.deleteUser(id);
		return "redirect:/users";
	}

}
