package com.product.service;
 
import java.util.List;

import com.product.model.Product;
 
public interface ProductService {
	 List<Product> getAllProducts();
	    void addProduct(List<Product> newProduct);
	    void deleteProduct(String productName);
	    void updateProduct(String productName, double newPrice);
}
 

