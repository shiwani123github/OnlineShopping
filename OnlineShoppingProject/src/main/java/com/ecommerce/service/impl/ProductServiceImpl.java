package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getProductById(Integer id) {
		Product pro = productRepository.findById(id);
		return pro;
	}

	@Override
	public void deleteById(Integer id) {
		productRepository.deleteById(id);

	}
}
