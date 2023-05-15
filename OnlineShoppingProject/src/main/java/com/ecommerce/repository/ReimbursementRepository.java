package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Reimbursement;
@Repository
public interface ReimbursementRepository extends CrudRepository<Reimbursement , Serializable>{
	public Reimbursement findById(Integer id);
}
