package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Address;
import com.ecommerce.repository.AddressRepository;
import com.ecommerce.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService{
	
	//inject Repository
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
       Integer id= address.getId();
       Address address_1 = addressRepository.findById(id).get();
       address_1.setId(address_1.getId());
       address_1.setStreet(address_1.getStreet());
       address_1.setCity(address_1.getCity());
       address_1.setState(address_1.getState());
       address_1.setPinCode(address_1.getPinCode());
       address_1.setCountry(address_1.getCountry());
       address_1.setUserId(address_1.getUserId());
       return addressRepository.save(address_1);
		
	}
}
