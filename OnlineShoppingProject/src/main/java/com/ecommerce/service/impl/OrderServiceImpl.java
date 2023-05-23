package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;
import com.ecommerce.model.Provider;
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

	@Override
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		Integer id = order.getId();
		Order order1 = orderRepository.findById(id).get();
		order1.setOrderId(order.getOrderId());
		order1.setPrice(order.getPrice());
		order1.setProductName(order.getProductName());
		order1.setQuantity(order.getQuantity());
		return orderRepository.save(order1);

	}

	@Override
	public void deleteById(Integer id) {
		orderRepository.deleteById(id);

	}

}
