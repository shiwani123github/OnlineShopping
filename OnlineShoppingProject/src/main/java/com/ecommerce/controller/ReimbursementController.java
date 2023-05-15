package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.ReimbusementService;

@RestController
public class ReimbursementController {
	@Autowired
	private ReimbusementService resimReimbusementService;
}
