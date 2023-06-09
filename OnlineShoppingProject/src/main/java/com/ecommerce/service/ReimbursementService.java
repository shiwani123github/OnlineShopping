package com.ecommerce.service;

import com.ecommerce.model.Reimbursement;

public interface ReimbursementService {
	public Reimbursement getReimbursementById(Integer id);

	public Reimbursement updateReimbursement(Reimbursement reimbursement);

	public Reimbursement saveReimbursement(Reimbursement reimbursement);

	public void deleteById(Integer id);

}
