package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.User;
import com.ecommerce.model.UserWithOrder;
import com.ecommerce.service.UserService;

@RestController
@RequestMapping("/Update")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/user/{id}")
	public UserWithOrder getUserWithOrder(@PathVariable("id") Integer id) {
		return userService.getUserWithOrder(id);

	}

	@DeleteMapping("/user/{id}/product")
	public ResponseEntity<String> deleteUserProduct(@PathVariable("id") Integer id) {
		userService.deleteUserWithProduct(id);
		return ResponseEntity.ok("user deleted successfully with its products...");
	}

	@PutMapping("/updateUserProduct")
	public User updateUserWithProduct(@RequestBody User user) {
		User user3 = userService.updateUserWithProduct(user);
		return user3;

	}

}
