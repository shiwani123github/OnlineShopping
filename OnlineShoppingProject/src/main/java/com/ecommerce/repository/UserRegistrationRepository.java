package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.UserRegistration;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer> {
	public UserRegistration findByEmail(String email);

	public UserRegistration findUserById(Integer id);

	public void deleteUserById(Integer Id);

}
