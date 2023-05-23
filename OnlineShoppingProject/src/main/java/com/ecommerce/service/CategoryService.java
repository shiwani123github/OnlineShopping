package com.ecommerce.service;

import com.ecommerce.model.Category;
import com.ecommerce.model.CategoryWithProduct;

public interface CategoryService {
	public Category saveCategory(Category category);

	public CategoryWithProduct getCategoryWithProduct(Integer id);

	public void deleteCategoryWithProduct(Integer id);

	public Category updateCategoryWithProduct(Category category);
}
