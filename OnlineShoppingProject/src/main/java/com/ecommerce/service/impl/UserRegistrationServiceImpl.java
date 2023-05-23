package com.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.UserRegistration;
import com.ecommerce.repository.UserRegistrationRepository;
import com.ecommerce.service.UserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;

	@Override
	public UserRegistration registerUser(UserRegistration userRegistration) {
		UserRegistration user = userRegistrationRepository.save(userRegistration);
		return user;
	}

	@Override
	public UserRegistration userLogin(String email) {
		UserRegistration user = userRegistrationRepository.findByEmail(email);
		return user;
	}

	@Override
	public UserRegistration getUserById(Integer id) {
		UserRegistration user = userRegistrationRepository.findUserById(id);
		return user;
	}

	@Override
	public void deleteUserById(Integer id) {
		userRegistrationRepository.deleteUserById(id);
	}

	@Override
	public List<UserRegistration> getAllUser(UserRegistration userRegistration) {
		List<UserRegistration> user = userRegistrationRepository.findAll();
		for (UserRegistration users : user) {
			users.setFullName(userRegistration.getFullName());
			users.setUserName(userRegistration.getUserName());
			users.setPassword(userRegistration.getPassword());
			users.setEmail(userRegistration.getEmail());
			users.setPrimaryMobile(userRegistration.getPrimaryMobile());
			users.setSecondaryMobile(userRegistration.getSecondaryMobile());
			users.setAge(userRegistration.getAge());
			users.setGender(userRegistration.getGender());
			users.setDob(userRegistration.getDob());
			users.setAddress(userRegistration.getAddress());
			users.setCity(userRegistration.getCity());
			users.setState(userRegistration.getState());
			users.setRefferalInfo(userRegistration.getRefferalInfo());
			users.setRefferalType(userRegistration.getRefferalType());
			users.setCreatedOn(userRegistration.getCreatedOn());
			users.setModifiedOn(userRegistration.getModifiedOn());
			users.setDeleted(userRegistration.isDeleted());
			users.setComments(userRegistration.getComments());
			users.setStatus(userRegistration.isStatus());
			userRegistrationRepository.save(users);
		}
		return user;
	}

}
