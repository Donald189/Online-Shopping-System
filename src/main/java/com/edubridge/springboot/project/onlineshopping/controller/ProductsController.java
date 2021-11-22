package com.edubridge.springboot.project.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.service.ProductsService;

@Controller
public class ProductsController {
	
	@Autowired
	ProductsService productsService;
	
	//to get list of products
	@GetMapping("/products")
	public List<Products> getAllProducts(){
		return productsService.getAllProducts();
	}

}
