package com.product.service;

import java.util.ArrayList;
import java.util.List;
 
import com.product.dao.ProductDAO;
import com.product.dao.ProductDaoImpl;
import com.product.model.Product;
 
public class ProductServiceImpl implements ProductService{
	private ProductDAO productDAO;
 
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
 
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDAO.getAllProducts();
	}
 
	@Override
	public void addProduct(List<Product> newProduct) {
		// TODO Auto-generated method stub
		for (Product product : newProduct) {
            productDAO.addProduct(product);
        }
    }
 
	@Override
	public void deleteProduct(String productName) {
		// TODO Auto-generated method stub
		 productDAO.deleteProduct(productName);
	}
 
	@Override
	public void updateProduct(String productName, double newPrice) {
		// TODO Auto-generated method stub
		productDAO.updateProduct(productName, newPrice);
		
	}
 
}

