package com.ecommerce.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Address;
import com.ecommerce.model.User;
import com.ecommerce.model.UserWithOrder;
import com.ecommerce.model.UserWithTransection;
import com.ecommerce.service.AddressService;
import com.ecommerce.service.UserService;

@RestController
@RequestMapping("/Update")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@Autowired
	private AddressService addressService;

	/*
	 * @Auther Balraj Naik
	 */
	@GetMapping("/userWithOrder/{id}")
	public UserWithOrder getUserWithOrder(@PathVariable("id") Integer id) {
		logger.info("In user controller");
		return userService.getUserWithOrder(id);

	}

	@DeleteMapping("/userProduct/{id}/product")
	public ResponseEntity<String> deleteUserProduct(@PathVariable("id") Integer id) {
		userService.deleteUserWithProduct(id);
		return ResponseEntity.ok("user deleted successfully with its products...");
	}

	/*
	 * @Auther Vikas Koli
	 */
	@PutMapping("/updateUserProduct")
	public User updateUserWithProduct(@RequestBody User user) {
		User user3 = userService.updateUserWithProduct(user);
		return user3;

	}

	@PostMapping("/saveUser")
	public User saveUserAddress(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		List<Address> addresses = user.getAddressList();
		for (Address address : addresses) {
			address.setUserId(user.getId());// 1
			addressService.saveAddress(address);
		}
		return user1;
	}

	@PostMapping("/saveUserTransection")
	public User saveUser(@RequestBody User user) {
		User users = userService.saveuser(user);

		return users;

	}

	/*
	 * @Auther shiwani Dewang
	 */
	@GetMapping("/userTransection/{id}")
	public UserWithTransection getUserWithTransection(@PathVariable("id") Integer id) {
		return userService.getUserWithTransection(id);

	}

	@DeleteMapping("/user/{id}/transection")
	public ResponseEntity<String> deleteUserWithSingleTransection(@PathVariable("id") Integer id) {
		userService.deleteUserWithSingleTransection(id);
		return ResponseEntity.ok().body("transection get deleted");
	}
}
