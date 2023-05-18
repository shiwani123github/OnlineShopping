package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Category;
import com.ecommerce.model.Product;
import com.ecommerce.service.CategoryService;
import com.ecommerce.service.ProductService;

@RestController
public class CategoryProductController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;

	@PostMapping("/saveCategoryProduct")
	public Category saveCategoryProduct(@RequestBody Category category) {
		Category category1 = categoryService.saveCategory(category);
		List<Product> product1 = category.getProductList();
		for (Product product : product1) {
			product.setCategory_Id(category.getId());
			productService.saveProduct(product);
		}
		return category1;

	}
}
