package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.service.ReimbursementService;

@RestController
public class ReimbursementController {
	@Autowired
	private ReimbursementService reimbursementService;

	@PostMapping("/saveReimbursement")
	public ResponseEntity<Reimbursement> saveReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement_1 = reimbursementService.saveReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement_1);

	}

	@PutMapping("/updateReimbursement/{id}")
	public Reimbursement updateReimbursement(@RequestBody Reimbursement reimbursement,
			@PathVariable("id") Integer reimbursementId) {
		Reimbursement rei = reimbursementService.updateReimbursement(reimbursement);
		return rei;

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Reimbursement> getReimbursementById(@PathVariable("id") Integer id) {
		Reimbursement rei = reimbursementService.getReimbursementtById(id);
		return ResponseEntity.ok().body(rei);
	}

	@DeleteMapping("/deleteReimbursement/{id}")
	public void deleteReimbursementById(@PathVariable("id") Integer id) {
		reimbursementService.deleteById(id);
	}

}
