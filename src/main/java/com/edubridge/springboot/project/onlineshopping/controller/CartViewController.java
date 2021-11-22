package com.edubridge.springboot.project.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubridge.springboot.project.onlineshopping.entities.Cart;
import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.entities.ProductsFromView;
import com.edubridge.springboot.project.onlineshopping.service.CartService;

@Controller
public class CartViewController {
	
	@Autowired
	CartService cartService;
    
	//requesting to view cart page
	@RequestMapping("/cart")
	public String viewCartPage(Model model) {
		List<Cart> cart = cartService.getAllUserOrders();
		model.addAttribute("cartList", cart);
		return "cart_products";
	}
	
	//To add products in cart by clicking add to cart
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	//@PostMapping("/save")
	public String saveProduct(@ModelAttribute("products") String productId ) {
		System.out.println(productId);
		cartService.addProduct(productId);
		return "redirect:/";
	}

}
