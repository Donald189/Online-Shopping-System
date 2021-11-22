package com.edubridge.springboot.project.onlineshopping.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Cart;
import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.entities.ProductsFromView;
import com.edubridge.springboot.project.onlineshopping.repository.CartRepository;
import com.edubridge.springboot.project.onlineshopping.repository.ProductsRepository;
import com.edubridge.springboot.project.onlineshopping.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartRepository cartRepo;
	
	@Autowired
	ProductsRepository productsRepo;
	
	@Override
	public Cart addProduct(String productIdStr) {
		Cart cart = new Cart();
		int productId = Integer.parseInt(productIdStr);
		Products products = productsRepo.findById(productId).get();
		List<Products> productsList = new ArrayList<>();
		productsList.add(products);
		cart.setProducts(productsList);
		return cartRepo.save(cart);
	}

	@Override
	public List<Cart> getAllUserOrders() {
		return cartRepo.findAll();
	}

	@Override
	public Cart saveProduct(Cart cart) {
		return cartRepo.save(cart);
	}

}
