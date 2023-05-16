package com.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;
import com.ecommerce.model.User;
import com.ecommerce.model.UserWithOrder;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.OrderService;
import com.ecommerce.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderService orderService;

	@Override
	public User saveUser(User user) {
		User users = userRepository.save(user);
		return users;

	}

	@Override
	public UserWithOrder getUserWithOrder(Integer id) {
		User user = userRepository.findById(id).orElse(null);
		if (user != null) {
			List<Order> order = user.getOrderList();
			UserWithOrder userWithOrder = new UserWithOrder();
			userWithOrder.setUser(user);
			userWithOrder.setOrderList(order);
			return userWithOrder;
		}
		return null;
	}

	@Override
	public void deleteUserWithProduct(Integer id) {
		User user = userRepository.findById(id).orElse(null);
		if (user != null && user.getOrderList() != null) {
			List<Order> order = user.getOrderList();
			userRepository.delete(user);

		}
	}

	@Override
	public User updateUserWithProduct(User user) {
		Integer id = user.getId();
		User user1 = userRepository.findById(id).get();
		user1.setUserName(user.getUserName());
		user1.setRealName(user.getRealName());
		user1.setPassword(user.getPassword());
		user1.setGender(user.getGender());
		user1.setDob(user.getDob());
		user1.setUserType(user.getUserType());
		List<Order> orders = user.getOrderList();
		for (Order order : orders) {
			order.setOrderId(order.getOrderId());
			order.setProductName(order.getProductName());
			order.setQuantity(order.getQuantity());
			order.setPrice(order.getPrice());
			order.setUserId(order.getUserId());
			orderService.updateProduct(order);

		}
		User user2 = userRepository.save(user1);
		return user2;
	}

}
