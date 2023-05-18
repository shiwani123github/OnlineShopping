package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Address;
import com.ecommerce.service.AddressService;


@RestController
@RequestMapping("/address")
public class AddressController {
	
	//inject the AddressService;
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/saveAddress")
	public ResponseEntity<Address> saveAddress(@RequestBody Address address) {
		Address address_1 =addressService.saveAddress(address);
		return ResponseEntity.ok().body(address_1);
		
	}
	
	@PutMapping("/updateAddress/{id}")
	public Address updateAddress(@RequestBody Address address , @PathVariable("id") Integer id) {
		Address address_1 =addressService.updateAddress(address);
		return address_1;
		
	}
}
