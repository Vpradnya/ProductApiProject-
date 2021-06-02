package com.productsApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productsApi.Dao.ProductDao;
import com.productsApi.entities.Product;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	private ProductDao productDao;

	//gets all the product from product table
	@Override
	public List<Product> getProduct() {
		return productDao.findAll();
	}
	
	//add the new product to product table
	@Override
	public Product addProduct(Product product) {
		productDao.save(product);
		return product;
	}

	//Update the existing product to product table
	@Override
	public Product UpdateProduct(Product product) {
		productDao.save(product);
		return product;
	}
	
	//delete the product from product table	
	@Override
	public Product deleteProduct(Product product) {
		Product entity = productDao.getById(product.getId());
		productDao.delete(entity);
		return entity;
		
	}

	//delete the product from product table
	@Override
	public void deleteProductByID(int id) {
		Product entity = productDao.getById(id);
		productDao.delete(entity);
		
	}

	
	
}
