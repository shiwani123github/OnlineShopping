package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Order;
import com.ecommerce.service.OrderService;
/*
 * @auther shiwani dewang
 */
@RestController
@RequestMapping("/Save")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping("/save")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
		Order order1 = orderService.saveOrder(order);
		return ResponseEntity.ok().body(order1);

	}

	@PutMapping("/update")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order, @PathVariable("id") Integer id) {
		Order order2 = orderService.saveOrder(order);
		return ResponseEntity.ok().body(order2);

	}

	@DeleteMapping("/deleteProvider/{id}")
	public void deleteProviderById(@PathVariable("id") Integer id) {
		orderService.deleteById(id);
	}

}
