package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;


@DeleteMapping("/deleteOrder/{id}")
public void deleteOrderById(@PathVariable("id") Integer id) {
	 orderService.deleteById(id);
}
}