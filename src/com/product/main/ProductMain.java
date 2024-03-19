package com.product.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
import com.product.model.Product;
import com.product.dao.ProductDAO;
import com.product.dao.ProductDaoImpl;
import com.product.service.*;
 
public class ProductMain {
	public static void main(String[] args) {
        ProductDAO productDAO = new ProductDaoImpl();
        ProductService productService = new ProductServiceImpl(productDAO);
 
        // Display product list
        System.out.println("Initial Product List:");
        productService.getAllProducts().forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));
 
        // Add new products
        productService.addProduct(List.of(
                new Product("Tablet", 29999),
                new Product("Camera", 49999),
                new Product("Smartwatch", 1999),
                new Product("High-End Laptop", 150000.0),
                new Product("Premium Smartphone", 25999)
        ));
 
        // Display updated product list
        System.out.println("\nProduct List After Addition:");
        productService.getAllProducts().forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));
 
        // Delete a product
        productService.deleteProduct("Smartphone");
 
        // Display updated product list
        System.out.println("\nProduct List After Deletion:");
        productService.getAllProducts().forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));
 
        // Update a product
        productService.updateProduct("Laptop", 60000);
 
        // Display final product list
        System.out.println("\nProduct List After Update:");
        productService.getAllProducts().forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));
 
        // Use Stream API to filter, sort, and display products with price > 30000
        List<Product> expensiveProducts = productService.getAllProducts().stream()
                .filter(product -> product.getPrice() > 30000)
          
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .collect(Collectors.toList());
 
        System.out.println("\nExpensive Products (> 30000) Sorted by Price:");
        expensiveProducts.forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));
    }
}
 