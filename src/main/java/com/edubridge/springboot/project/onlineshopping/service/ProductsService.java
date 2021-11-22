package com.edubridge.springboot.project.onlineshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Products;

@Service
public interface ProductsService {

	List<Products> getAllProducts();

}
