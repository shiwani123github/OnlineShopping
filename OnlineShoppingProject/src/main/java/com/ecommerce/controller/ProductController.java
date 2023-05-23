package com.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

/*
 * @auther shiwani dewang
 */
@RestController
@RequestMapping("/Product")
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private ProductService productService;

	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		logger.info("In product controller");
		Product product_1 = productService.saveProduct(product);
		return ResponseEntity.ok().body(product_1);
	}

	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable("id") Integer id) {
		return productService.updateProduct(product);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id) {
		Product product = productService.getProductById(id);
		return ResponseEntity.ok().body(product);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProductById(@PathVariable("id") Integer id) {
		productService.deleteById(id);
	}

}
