package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Integer> {

}
