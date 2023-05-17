package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	// inject the productService object
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		Product product_1= productService.saveProduct(product);
		return ResponseEntity.ok().body(product_1);	
	}
	
	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@RequestBody Product product , @PathVariable ("id") Integer id) {
		return productService.updateProduct(product);	
	}
}
