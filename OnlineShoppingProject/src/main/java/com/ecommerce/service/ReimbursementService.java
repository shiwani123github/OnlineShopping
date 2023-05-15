package com.ecommerce.service;

import com.ecommerce.model.Reimbursement;

public interface ReimbursementService {

	public Reimbursement getReimbursementtById(Integer id);

	public void deleteById(Integer id);

}
