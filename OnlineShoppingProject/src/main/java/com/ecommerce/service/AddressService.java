package com.ecommerce.service;

import com.ecommerce.model.Address;

public interface AddressService {
	public Address geAddressById(Integer id);

	public void deleteById(Integer id);

}
