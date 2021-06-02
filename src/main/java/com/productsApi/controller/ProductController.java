package com.productsApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productsApi.entities.Product;
import com.productsApi.services.IProductService;

@RestController
public class ProductController {
	@Autowired  
	private IProductService productService;  
	
	//mapping the getProduct() method to /allproduct - (get all the product list)  
	@GetMapping("/allProduct")  
	public List<Product> getProduct()   
	{  
	//finds all the products  
	List<Product> products = productService.getProduct();  
	//returns the product list  
	return products;  
	}  
	
	//mapping the addProduct() method to /product (Add the product)
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product){
		
		return this.productService.addProduct(product);
	}
	
	//mapping the editProduct() method to /product - (update the product)
	@PutMapping("/product")
	public Product editProduct(@RequestBody Product product){
		
		return this.productService.UpdateProduct(product);
	}
	
	//mapping the deleteProduct() method to /product - (delete the product)
	@DeleteMapping("/product")
		public Product deleteProduct(@RequestBody Product product){
			
			return this.productService.deleteProduct(product);
		}
	
	///mapping the deleteProductByID() method to /product/{id} - Delete the product 
	@DeleteMapping("/product/{id}") 
	public ResponseEntity<HttpStatus> deleteProductByID(@PathVariable int id){
		try {
			this.productService.deleteProductByID(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e ) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
