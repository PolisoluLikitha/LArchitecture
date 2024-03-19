package com.product.dao;

import java.util.List;

import com.product.model.Product;
 
public interface ProductDAO {
	
	List<Product> getAllProducts();
	
    void addProduct(Product product);
    
    void deleteProduct(String productName);
    
    void updateProduct(String productName, double newPrice);
    
}