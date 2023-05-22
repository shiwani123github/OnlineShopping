package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.UserRegistration;

public interface UserRegistrationService {
	public UserRegistration registerUser(UserRegistration userRegistration);

	public UserRegistration userLogin(String email);

	public UserRegistration getUserById(Integer id);

	public void deleteUserById(Integer id);

	public List<UserRegistration> getAllUser(UserRegistration userRegistration);

}
