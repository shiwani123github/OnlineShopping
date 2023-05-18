package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Address;
import com.ecommerce.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;

	@GetMapping("/user/{id}/address")
	public List<Address> getAddressByUserId(@PathVariable("id") Integer id) {
		List<Address> address = addressService.getAddressByUserId(id);
		return address;

	}

}
