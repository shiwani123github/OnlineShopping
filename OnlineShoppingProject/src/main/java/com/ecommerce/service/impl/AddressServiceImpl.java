package com.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Address;
import com.ecommerce.repository.AddressRepository;
import com.ecommerce.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address address) {
		Address addresses = addressRepository.save(address);
		return addresses;
	}

	@Override
	public List<Address> getAddressByUserId(Integer id) {
		List<Address> address = addressRepository.getByUserId(id);
		return address;
	}

}
