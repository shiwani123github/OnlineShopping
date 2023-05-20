package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.BankAccount;
import com.ecommerce.repository.BankAccountRepository;
import com.ecommerce.service.BankAccountService;

@Service
public class BankAccountServiceImpl implements BankAccountService{
	
	// inject the BankAccountRepository
	@Autowired
	private BankAccountRepository bankAccountRepository;

	@Override
	public BankAccount saveBankAccount(BankAccount bankAccount) {
		return bankAccountRepository.save(bankAccount);
	}

}
