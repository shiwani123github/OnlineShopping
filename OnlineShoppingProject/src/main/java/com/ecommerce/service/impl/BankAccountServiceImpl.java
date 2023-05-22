package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.BankAccount;
import com.ecommerce.repository.BankAccountRepository;
import com.ecommerce.service.BankAccountService;

/*
 * @Auther Balraj Naik
 */
@Service
public class BankAccountServiceImpl implements BankAccountService {
	@Autowired
	private BankAccountRepository bankAccountRepository;

	@Override
	public BankAccount saveBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		return null;
	}

}
