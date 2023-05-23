package com.ecommerce.service;

import com.ecommerce.model.Currency;

public interface CurrencyService {
	public Currency saveCurrency(Currency currency);

	public Currency updateCurrencyById(int id, Currency currency);

	public Currency getCurrencyById(Integer id);

	public void deleteCurrency(Integer id);

}
