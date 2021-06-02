package com.productsApi.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productsApi.entities.Product;

public interface IProductService{
	List<Product> getProduct();

	Product addProduct(Product product);  
	
	Product UpdateProduct(Product product); 
	
	Product deleteProduct(Product product);

	void deleteProductByID(int id);

}
