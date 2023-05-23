package com.ecommerce.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Category;
import com.ecommerce.model.Product;
import com.ecommerce.service.CategoryService;
import com.ecommerce.service.ProductService;

/*
 * @Auther shiwani dewang
 */
@RestController
@RequestMapping("/CategoryProduct")
public class CategoryProductController {
	private static final Logger logger = LoggerFactory.getLogger(CategoryProductController.class);
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;

	@PostMapping("/saveCategoryProduct")
	public Category saveCategoryProduct(@RequestBody Category category) {
		logger.info("In  category product controller class ");
		Category category1 = categoryService.saveCategory(category);
		List<Product> product1 = category.getProductList();
		for (Product product : product1) {
			product.setCategory_Id(category.getId());
			productService.saveProduct(product);
		}
		return category1;

	}
}
