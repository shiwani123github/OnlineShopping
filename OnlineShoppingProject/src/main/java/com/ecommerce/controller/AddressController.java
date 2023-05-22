package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Address;
import com.ecommerce.service.AddressService;

@RestController
@RequestMapping("/Address")
public class AddressController {
	@Autowired
	private AddressService addressService;

	/*
	 * @auther Balraj Naik
	 */
	@PostMapping("/saveAddress")
	public ResponseEntity<Address> saveAddress(@RequestBody Address address) {
		Address address_1 = addressService.saveAddress(address);
		return ResponseEntity.ok().body(address_1);

	}

	@GetMapping("/user/{id}/address")
	public List<Address> getAddressByUserId(@PathVariable("id") Integer id) {
		List<Address> address = addressService.getAddressByUserId(id);
		return address;

	}

	/*
	 * @auther vikas koli
	 */
	@DeleteMapping("/deleteAddress/{id}")
	public void deleteAddressById(@PathVariable("id") Integer id) {
		addressService.deleteById(id);
	}

}
