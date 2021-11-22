package com.edubridge.springboot.project.onlineshopping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.repository.ProductsRepository;
import com.edubridge.springboot.project.onlineshopping.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	ProductsService productsService;
	
	@Autowired
	ProductsRepository productsRepo;

	@Override
	public List<Products> getAllProducts() {
		return productsRepo.findAll();
	}
	
	

}
