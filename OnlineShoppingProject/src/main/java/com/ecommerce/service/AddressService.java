package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Address;

public interface AddressService {
	public Address saveAddress(Address address);

	public List<Address> getAddressByUserId(Integer id);

	public void deleteById(Integer id);
}
