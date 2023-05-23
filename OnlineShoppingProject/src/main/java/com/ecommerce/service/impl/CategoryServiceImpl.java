package com.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;
import com.ecommerce.model.CategoryWithProduct;
import com.ecommerce.model.Product;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.service.CategoryService;
import com.ecommerce.service.ProductService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductService productService;

	@Override
	public Category saveCategory(Category category) {
		Category categories = categoryRepository.save(category);
		return categories;
	}

	@Override
	public CategoryWithProduct getCategoryWithProduct(Integer id) {
		Category category = categoryRepository.findById(id).orElse(null);
		if (category != null) {
			List<Product> product = category.getProductList();
			CategoryWithProduct categoryWithProduct = new CategoryWithProduct();
			categoryWithProduct.setCategory(category);
			categoryWithProduct.setProductList(product);
			return categoryWithProduct;
		}
		return null;
	}

	@Override
	public void deleteCategoryWithProduct(Integer id) {
		Category category = categoryRepository.findById(id).orElse(null);
		if (category != null && category.getProductList() != null) {
			List<Product> product = category.getProductList();
			categoryRepository.delete(category);

		}

	}

	@Override
	public Category updateCategoryWithProduct(Category category) {
		Integer id = category.getId();
		Category category1 = categoryRepository.findById(id).get();
		category1.setCategoryId(category.getCategoryId());
		category1.setCategoryName(category.getCategoryName());
		List<Product> products = category.getProductList();
		for (Product product : products) {
			product.setCategory_Id(category.getId());
			product.setProductId(product.getProductId());
			product.setProductName(product.getProductName());
			product.setDescription(product.getDescription());
			product.setPrize(product.getPrize());
			product.setQuantity(product.getQuantity());
			product.setStock(product.getStock());
			productService.updateProduct(product);

		}
		Category category2 = categoryRepository.save(category1);
		return category2;
	}
}
