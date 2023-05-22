package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Category;
import com.ecommerce.model.CategoryWithProduct;
import com.ecommerce.service.CategoryService;

/*
 * @Auther shiwani dewang
 */
@RestController
@RequestMapping("/Update")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/category/{id}")
	public CategoryWithProduct getCategoryWithProduct(@PathVariable("id") Integer id) {
		return categoryService.getCategoryWithProduct(id);

	}

	@DeleteMapping("/category/{id}/product")
	public ResponseEntity<String> deleteCategoryProduct(@PathVariable("id") Integer id) {
		categoryService.deleteCategoryWithProduct(id);
		return ResponseEntity.ok("category deleted successfully with its products...");
	}

	@PutMapping("/updateCategory")
	public Category updateCategoryWithProduct(@RequestBody Category category) {
		Category category3 = categoryService.updateCategoryWithProduct(category);
		return category3;

	}

}
