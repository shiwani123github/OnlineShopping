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
	public Reimbursement getReimbursementById(Integer id) {
		Reimbursement rei = reimbursementRepository.findById(id).get();
		return rei;

	}

	@Override
	public void deleteById(Integer id) {
		reimbursementRepository.deleteById(id);
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement reimbursement) {
		Integer id = reimbursement.getReimbursementId();
		Reimbursement reimbursement_1 = reimbursementRepository.findById(id).get();
		reimbursement_1.setEmplId(reimbursement_1.getEmplId());
		reimbursement_1.setAmount(reimbursement_1.getAmount());
		reimbursement_1.setType(reimbursement_1.getType());
		reimbursement_1.setStatus(reimbursement_1.getStatus());
		Reimbursement reimbursement_2 = reimbursementRepository.save(reimbursement_1);
		return reimbursement_2;
	}

	@Override
	public Reimbursement saveReimbursement(Reimbursement reimbursement) {
		return reimbursementRepository.save(reimbursement);

	}

}
