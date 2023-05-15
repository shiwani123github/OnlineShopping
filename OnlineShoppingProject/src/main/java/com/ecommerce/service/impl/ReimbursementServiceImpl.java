package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.ReimbursementRepository;
import com.ecommerce.service.ReimbusementService;

@Service
public class ReimbursementServiceImpl implements ReimbusementService {
	@Autowired
	private ReimbursementRepository reimbursementRepository;

}
