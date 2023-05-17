package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	
	// inject the ProductRepository
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);

	}

	@Override
	public Product updateProduct(Product product) {
	  Integer id = product.getId();
	 Product product_1 = productRepository.findById(id).get();
	 product_1.setId(product_1.getId());
	 product_1.setProductId(product_1.getProductId());
	 product_1.setProductName(product_1.getProductName());
	 product_1.setDescription(product_1.getDescription());
	 product_1.setPrize(product_1.getPrize());
	 product_1.setQuantity(product_1.getQuantity());
	 product_1.setStock(product_1.getStock());
	return productRepository.save(product_1);
		
	}
}
