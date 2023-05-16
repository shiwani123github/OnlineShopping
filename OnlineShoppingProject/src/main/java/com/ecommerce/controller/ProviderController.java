package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Provider;
import com.ecommerce.service.ProviderService;

@RestController
public class ProviderController {

	@Autowired
	private ProviderService providerService;

	@GetMapping("/get/{id}")
	public ResponseEntity<Provider> getProviderById(@PathVariable("id") Integer id) {
		Provider pro = providerService.getProviderById(id);
		return ResponseEntity.ok().body(pro);
	}

	@DeleteMapping("/deleteProvider/{id}")
	public void deleteProviderById(@PathVariable("id") Integer id) {
		providerService.deleteById(id);
	}
}
