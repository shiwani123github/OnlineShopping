package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Cart;
import com.ecommerce.service.CartService;

@RestController
@RequestMapping("/Cart")
public class CartController {
	@Autowired
	private CartService cartService;

	/*
	 * @Auther Balraj Naik
	 */
	@PostMapping("/saveCart")
	public ResponseEntity<Cart> saveCart(@RequestBody Cart cart) {
		Cart cart_1 = cartService.saveCart(cart);
		return ResponseEntity.ok().body(cart_1);

	}

	/*
	 * @AUther Vikas Koli
	 */
	@GetMapping("/getCart/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable("id") Integer id) {
		Cart car = cartService.getCartById(id);
		return ResponseEntity.ok().body(car);
	}

}
