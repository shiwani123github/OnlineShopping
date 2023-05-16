package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveProduct(Order order) {
		Order orders = orderRepository.save(order);
		return orders;
	}

	@Override
	public Order updateProduct(Order order) {
		Order orders = orderRepository.save(order);
		return orders;

	}

}
