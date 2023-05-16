package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Payment> getPaymentById(@PathVariable("id") Integer id) {
		Payment pay = paymentService.getPaymentById(id);
		return ResponseEntity.ok().body(pay);
		}
}
