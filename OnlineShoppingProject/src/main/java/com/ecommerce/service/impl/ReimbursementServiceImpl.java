package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.repository.ReimbursementRepository;
import com.ecommerce.service.ReimbursementService;

@Service
public class ReimbursementServiceImpl implements ReimbursementService {

	@Autowired
	private ReimbursementRepository reimbursementRepository;

	@Override
	public Reimbursement getReimbursementtById(Integer id) {
		Reimbursement rei = reimbursementRepository.findById(id);
		return rei;
	}

	@Override
	public void deleteById(Integer id) {
		reimbursementRepository.deleteById(id);

	}
}
