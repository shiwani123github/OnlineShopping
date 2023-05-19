package com.ecommerce.service.impl;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Address;
import com.ecommerce.repository.AddressRepository;
import com.ecommerce.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;

	@Override
	public Address geAddressById(Integer id) {
		Address add = addressRepository.findById(id);
		return add;
	}

	@Override
	public void deleteById(Integer id) {
		addressRepository.deleteById(id);

	}

}
