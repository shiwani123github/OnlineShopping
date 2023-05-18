package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Transection;

@Repository
public interface TransectionRepository extends JpaRepository<Transection, Integer> {

}
