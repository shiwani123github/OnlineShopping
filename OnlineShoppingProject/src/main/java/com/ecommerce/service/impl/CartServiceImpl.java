package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Cart;
import com.ecommerce.repository.CartRepository;
import com.ecommerce.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart saveCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public Cart getCartById(Integer id) {
		Cart cart = cartRepository.findById(id).get();
		return cart;
	}

	@Override
	public Cart calculateCartAmount(Integer id) {
		
		return null;
	}

}
