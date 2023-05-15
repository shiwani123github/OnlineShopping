package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.service.ReimbursementService;

@RestController
@RequestMapping("/reimbursement")
public class ReimbursementController {
	
	@Autowired
	private ReimbursementService reimbursementService;
	
	@PutMapping("/updateReimbursement/{id}")
	public Reimbursement updateReimbursement(@RequestBody Reimbursement reimbursement , @PathVariable ("id") Integer reimbursementId) {
		Reimbursement rei = reimbursementService.updateReimbursement(reimbursement);
		return rei;
		
	}
	
	@PostMapping("/saveReimbursement")
	public ResponseEntity<Reimbursement> saveReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement_1 =reimbursementService.saveReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement_1);
		
	}

}
