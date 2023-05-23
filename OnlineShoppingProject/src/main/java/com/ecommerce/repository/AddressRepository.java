package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	public List<Address> getByUserId(Integer id);
}
