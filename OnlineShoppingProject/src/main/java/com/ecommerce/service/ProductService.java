package com.ecommerce.service;

import com.ecommerce.model.Product;

public interface ProductService {
	public Product getProductById(Integer id);

	public void deleteById(Integer id);

}
