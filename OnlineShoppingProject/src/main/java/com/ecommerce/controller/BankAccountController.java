package com.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.BankAccount;
import com.ecommerce.service.BankAccountService;

/*
 * @ATher Balraj Naik
 */
@RestController
@RequestMapping("/Account")
public class BankAccountController {
	private static final Logger logger = LoggerFactory.getLogger(BankAccountController.class);
	@Autowired
	private BankAccountService bankAccountService;

	@PostMapping("/saveBankAccount")
	public ResponseEntity<BankAccount> saveBankAccount(@RequestBody BankAccount bankAccount) {
		logger.info("In bank account controller class");
		BankAccount bankAccount_1 = bankAccountService.saveBankAccount(bankAccount);
		return ResponseEntity.ok().body(bankAccount_1);

	}
}
