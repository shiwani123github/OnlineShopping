package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Cart;
import com.ecommerce.service.CartService;

@RestController
public class CartController {
	@Autowired
	private CartService cartService;

	@GetMapping("/get/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable("id") Integer id) {
		Cart car = cartService.getCartById(id);
		return ResponseEntity.ok().body(car);
	}
}
