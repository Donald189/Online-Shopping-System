package com.edubridge.springboot.project.onlineshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Cart;
import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.entities.ProductsFromView;

@Service
public interface CartService {

  public Cart addProduct(String productId );
	//public Cart addProduct(String productName );
	
  public List<Cart> getAllUserOrders();
  
  public Cart saveProduct(Cart cart);

  //public String getProductById(int id);

}