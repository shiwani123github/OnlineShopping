package com.ecommerce.service;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;

public interface ProductService {
	public Product saveProduct(Product product);

	public Product updateProduct(Product product);

	public Product getProductById(Integer id);

	public void deleteById(Integer id);
}
