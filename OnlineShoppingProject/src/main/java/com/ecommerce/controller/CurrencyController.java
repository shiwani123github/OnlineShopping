package com.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Currency;
import com.ecommerce.repository.CurrencyRepository;
import com.ecommerce.service.CurrencyService;

/*
 * @Auther shiwani Dewang
 */
@RestController
@RequestMapping("/Currency")
public class CurrencyController {
	private static final Logger logger = LoggerFactory.getLogger(CurrencyController.class);
	@Autowired
	private CurrencyService currencyService;
	@Autowired
	private CurrencyRepository currencyRepository;

	@PostMapping("/saveCurrency")
	public Currency saveCurrency(@RequestBody Currency currency) {
		currency.setTotalCalculatedAmount(currency.getConversionMultiple().multiply(currency.getQuantity()));
		Currency currency2 = currencyRepository.save(currency);
		logger.info("In currency Controller Class");
		return currency2;

	}

	@PutMapping("/updateCurrency/{id}")
	public Currency updateCurrencyById(@PathVariable("id") Integer id, @RequestBody Currency currency) {
		Currency currency3 = currencyService.updateCurrencyById(id, currency);
		return currency3;

	}

	@GetMapping("/getCurrency/{id}")
	public Currency getCurrencyById(@PathVariable("id") Integer id) {
		Currency currency = currencyService.getCurrencyById(id);
		return currency;

	}

	@DeleteMapping("/deleteCurrency/{id}")
	public ResponseEntity<String> deletdCurrencyById(@PathVariable("id") Integer id) {
		currencyService.deleteCurrency(id);
		return ResponseEntity.ok().body(" Currency details deleted successfully ! ");

	}

}
