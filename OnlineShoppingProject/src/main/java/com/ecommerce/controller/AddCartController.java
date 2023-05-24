package com.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.AddCart;
import com.ecommerce.repository.AddCartRepository;
import com.ecommerce.service.AddCartService;

@RestController
@RequestMapping("/AddCart")
public class AddCartController {
	private static final Logger logger = LoggerFactory.getLogger(AddCartController.class);

	@Autowired
	private AddCartService addCartService;

	@Autowired
	private AddCartRepository addCartRepository;
	/*
	 * @Auther shiwani dewang
	 */

	@PostMapping("/addProduct")
	public ResponseEntity<AddCart> addToCart(@RequestBody AddCart addCart) {
		logger.info("In addCart class");
		addCart.setTotalAmount(addCart.getPrice().multiply(addCart.getQuantity()));
		AddCart cart = addCartRepository.save(addCart);
		return ResponseEntity.ok().body(cart);
	}

	@GetMapping("/getTotal/{id}")
	public AddCart getCartById(@PathVariable("id") Integer id) {
		AddCart addCart = addCartService.getCartById(id);
		return addCart;

	}
	/*
	 * @Vikas Koli
	 */

	@PutMapping("/updateCart/{id}")
	public AddCart updateCartById(@PathVariable("id") Integer id, @RequestBody AddCart addCart) {
		AddCart cart1 = addCartService.updateCartById(id, addCart);
		return cart1;
	}

	public ResponseEntity<String> deleteCartById(Integer id) {
		addCartService.deletedCartById(id);
		return ResponseEntity.ok().body("cart deleted successfully ! ");
	}
}
