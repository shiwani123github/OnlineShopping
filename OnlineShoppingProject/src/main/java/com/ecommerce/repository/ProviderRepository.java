package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Serializable> {
	public Provider findById(Integer id);
}
