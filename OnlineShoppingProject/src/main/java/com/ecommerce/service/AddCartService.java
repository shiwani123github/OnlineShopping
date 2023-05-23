package com.ecommerce.service;

import com.ecommerce.model.AddCart;

public interface AddCartService {
	public AddCart addToCart(AddCart addCart);

	public AddCart getCartById(Integer id);

	public AddCart updateCartById(int id, AddCart addCart);

	public void deletedCartById(Integer id);

}
