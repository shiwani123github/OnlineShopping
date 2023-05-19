package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Address;
import com.ecommerce.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;

	@GetMapping("/get/{id}")
	public ResponseEntity<Address> getAddressById(@PathVariable("id") Integer id) {
		Address add = addressService.geAddressById(id);
		return ResponseEntity.ok().body(add);
	}

	@DeleteMapping("/deleteAddress/{id}")
	public void deleteAddressById(@PathVariable("id") Integer id) {
		addressService.deleteById(id);
	}
}
