package com.ecommerce.service;

import com.ecommerce.model.User;
import com.ecommerce.model.UserWithOrder;
import com.ecommerce.model.UserWithTransection;

public interface UserService {
	public User saveUser(User user);

	public UserWithOrder getUserWithOrder(Integer id);

	public void deleteUserWithProduct(Integer id);

	public User updateUserWithProduct(User user);

	public UserWithTransection getUserWithTransection(Integer id);

	public void deleteUserWithSingleTransection(Integer id);

	public User saveuser(User user);

}
