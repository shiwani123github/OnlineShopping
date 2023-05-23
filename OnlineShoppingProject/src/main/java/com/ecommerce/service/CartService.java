package com.ecommerce.service;

import com.ecommerce.model.Cart;

public interface CartService {
	public Cart saveCart(Cart cart);

	public Cart getCartById(Integer id);

	public Cart calculateCartAmount(Integer id);
}
