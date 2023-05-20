package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Cart;
import com.ecommerce.service.CartService;

@RestController
public class CartController {
	
	//inject the CartService
	@Autowired
	private CartService cartService;
	
	@PostMapping("/saveCart")
	public ResponseEntity<Cart> saveCart(@RequestBody Cart cart) {
		Cart cart_1 = cartService.saveCart(cart);
		return ResponseEntity.ok().body(cart_1);
		
	}

}
