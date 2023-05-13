package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Payment;
import com.ecommerce.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@PostMapping("/savePayment")
	public ResponseEntity<Payment> savePayment(@RequestBody Payment payment) {
		Payment pay = paymentService.savePayment(payment);
		return ResponseEntity.ok().body(pay);

	}

	@PutMapping("/updatePayment")
	public Payment updatePayment(@RequestBody Payment payment) {
		Payment pay = paymentService.updatePayment(payment);
		return pay;
	}

}
