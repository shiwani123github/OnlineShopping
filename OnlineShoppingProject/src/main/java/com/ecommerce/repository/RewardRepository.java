package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Payment;
import com.ecommerce.model.Reward;

@Repository
public interface RewardRepository extends CrudRepository<Reward , Serializable>{

}
