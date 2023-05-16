package com.ecommerce.service;

import com.ecommerce.model.User;
import com.ecommerce.model.UserWithOrder;

public interface UserService {
	public User saveUser(User user);

	public UserWithOrder getUserWithOrder(Integer id);

	public void deleteUserWithProduct(Integer id);

	public User updateUserWithProduct(User user);

}
