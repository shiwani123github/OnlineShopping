package com.ecommerce.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.controller.AddressController;
import com.ecommerce.model.Address;
import com.ecommerce.repository.AddressRepository;
import com.ecommerce.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address address) {
		logger.info("In address service implementation class");
		Address addresses = addressRepository.save(address);
		return addresses;
	}

	@Override
	public List<Address> getAddressByUserId(Integer id) {
		List<Address> address = addressRepository.getByUserId(id);
		return address;
	}

	@Override
	public void deleteById(Integer id) {
		addressRepository.deleteById(id);

	}

}
