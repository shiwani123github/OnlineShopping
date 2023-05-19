package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/get/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id) {
		Product pro = productService.getProductById(id);
		return ResponseEntity.ok().body(pro);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProductById(@PathVariable("id") Integer id) {
		productService.deleteById(id);
	}
}