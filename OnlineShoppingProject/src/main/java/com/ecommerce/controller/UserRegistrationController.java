package com.ecommerce.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.UserRegistration;
import com.ecommerce.service.UserRegistrationService;

/*
 * @Auther shiwani Dewang 
 */
@RestController
@RequestMapping("/Rgistration")
public class UserRegistrationController {
	private static final Logger logger = LoggerFactory.getLogger(UserRegistrationController.class);
	@Autowired
	private UserRegistrationService userRegistrationService;

	@PostMapping("/registerUser")
	public UserRegistration registerUser(@RequestBody UserRegistration userRegistration) {
		logger.info("In User registration class");
		UserRegistration user = userRegistrationService.registerUser(userRegistration);
		return user;

	}

	@PostMapping("/userLogin")
	public ResponseEntity<String> userLogin(@RequestBody UserRegistration userRegistration) {
		UserRegistration userRegistration2 = userRegistrationService.userLogin(userRegistration.getEmail());
		if (userRegistration2 != null && userRegistration2.getPassword().equals(userRegistration.getPassword())) {
			return ResponseEntity.ok().body("Login successful !");
		} else {
			return ResponseEntity.ok().body("Invalid email or password ! ");
		}
	}

	@GetMapping("/getUser/{id}")
	public UserRegistration getUserById(@PathVariable("id") Integer id) {
		UserRegistration user = userRegistrationService.getUserById(id);
		return user;

	}

	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id) {
		userRegistrationService.deleteUserById(id);
		return ResponseEntity.ok().body("User get deleted successfully ! ");

	}

	@GetMapping("/getAllUser/{id}")
	public List<UserRegistration> getAllUser(@PathVariable("id") UserRegistration userRegistration) {
		List<UserRegistration> userList = userRegistrationService.getAllUser(userRegistration);
		return userList;

	}
}
