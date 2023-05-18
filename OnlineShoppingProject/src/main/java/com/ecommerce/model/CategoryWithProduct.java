package com.ecommerce.model;

import java.util.List;

public class CategoryWithProduct {
	private Category category;
	private List<Product> productList;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}
