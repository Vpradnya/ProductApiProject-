package com.productsApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productsApi.entities.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	

}
