package com.ecommerce.service;

import com.ecommerce.model.Order;
import com.ecommerce.model.Provider;

public interface OrderService {
	public Order saveProduct(Order order);

	public Order updateProduct(Order order);

	public Order saveOrder(Order order);

	public Order updateOrder(Order order);

	public void deleteById(Integer id);

}
