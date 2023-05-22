package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Order;
import com.ecommerce.model.User;
import com.ecommerce.service.OrderService;
import com.ecommerce.service.UserService;

@RestController
@RequestMapping("/userOrder")
public class UserOrderController {
	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;

	/*
	 * @Auther Balraj Naik
	 */
	@PostMapping("/saveUserProduct")
	public User saveUserProduct(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		List<Order> order1 = user.getOrderList();
		for (Order order : order1) {
			order.setUserId(user.getId());
			orderService.saveProduct(order);
		}
		return user1;

	}

}
