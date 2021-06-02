package com.productsApi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;  
	private String name;  
	private String batchno;  
	private double price;  
	private int quantity;  
	//default constructor  
	public Product()  
	{  
	      
	}  
	//constructor using fields  
	public Product(int id, String name, String batchno, double price, int quantity)   
	{    
	this.id = id;  
	this.name = name;  
	this.batchno = batchno;  
	this.price = price;  
	this.quantity = quantity;  
	}  
	//getters and setters  
	public int getId()   
	{  
	return id;  
	}  
	public void setId(int id)   
	{  
	this.id = id;  
	}  
	public void setName(String name)   
	{  
	this.name = name;  
	}  
	public String getBatchno()   
	{  
	return batchno;  
	}  
	public void setBatchno(String batchno)   
	{  
	this.batchno = batchno;  
	}  
	public String getName()   
	{  
	return name;  
	}
	public double getPrice()   
	{  
	return price;  
	}  
	public void setPrice(double price)   
	{  
	this.price = price;  
	}  
	public int getQuantity()   
	{  
	return quantity;  
	}  
	public void setQuantity(int quantity)   
	{  
	this.quantity = quantity;  
	}  
}
