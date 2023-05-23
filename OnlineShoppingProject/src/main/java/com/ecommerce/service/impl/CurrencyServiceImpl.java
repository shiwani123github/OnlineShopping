package com.ecommerce.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Currency;
import com.ecommerce.repository.CurrencyRepository;
import com.ecommerce.service.CurrencyService;

@Service
public class CurrencyServiceImpl implements CurrencyService {
	private static final Logger logger = LoggerFactory.getLogger(CurrencyServiceImpl.class);
	@Autowired
	private CurrencyRepository currencyRepository;

	@Override
	public Currency saveCurrency(Currency currency) {
		logger.info("In currency Service implementation class");
		Currency currency1 = currencyRepository.save(currency);
		return currency1;
	}

	@Override
	public Currency updateCurrencyById(int id, Currency currency) {
		Currency currency1 = currencyRepository.findById(id).get();
		currency1.setFroms(currency.getFroms());
		currency1.setToo(currency.getToo());
		currency1.setConversionMultiple(currency.getConversionMultiple());
		currency1.setQuantity(currency.getQuantity());
		currency1.setTotalCalculatedAmount(currency.getTotalCalculatedAmount());
		currency1.setPorts(currency.getPorts());
		Currency currency2 = currencyRepository.save(currency1);
		return currency2;
	}

	@Override
	public Currency getCurrencyById(Integer id) {
		Currency currency1 = currencyRepository.findById(id).get();
		return currency1;
	}

	@Override
	public void deleteCurrency(Integer id) {
		currencyRepository.deleteById(id);

	}

}
