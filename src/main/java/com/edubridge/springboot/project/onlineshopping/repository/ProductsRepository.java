package com.edubridge.springboot.project.onlineshopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.springboot.project.onlineshopping.entities.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
