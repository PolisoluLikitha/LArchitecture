package com.product.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
import com.product.model.Product;
 
public class ProductDaoImpl implements ProductDAO{
	private List<Product> productList;
 
    public ProductDaoImpl() {
        this.productList = new ArrayList<>();
        // Adding some initial products
        productList.add(new Product("Laptop", 45000));
        productList.add(new Product("Smartphone", 4999.99));
        productList.add(new Product("Headphones", 799.99));
    }
 
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return new ArrayList<>(productList);
	}
 
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productList.add(product);
		
	}
 
	@Override
	public void deleteProduct(String productName) {
		// TODO Auto-generated method stub
		Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(productName)) {
                iterator.remove();
                break;
            }
        }
	}
 
	@Override
	public void updateProduct(String productName, double newPrice) {
		// TODO Auto-generated method stub
		for (Product product : productList) {
            if (product.getName().equals(productName)) {
                product.setPrice(newPrice);
                break;
            }
        }
    }
}