package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Provider;
import com.ecommerce.service.ProviderService;

@RestController
public class ProviderController {
	@Autowired
	private ProviderService providerService;

	@PostMapping("/save")
	public ResponseEntity<Provider> saveProvider(@RequestBody Provider provider) {
		Provider provider1 = providerService.saveProvider(provider);
		return ResponseEntity.ok().body(provider1);

	}

	@PutMapping("/update")
	public ResponseEntity<Provider> updateProvider(@RequestBody Provider provider, @PathVariable("id") Integer pid) {
		Provider provider2 = providerService.saveProvider(provider);
		return ResponseEntity.ok().body(provider2);

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Provider> getProviderById(@PathVariable("id") Integer id) {
		Provider provider = providerService.getProviderById(id);
		return ResponseEntity.ok().body(provider);
	}

	@DeleteMapping("/deleteProvider/{id}")
	public void deleteProviderById(@PathVariable("id") Integer id) {
		providerService.deleteById(id);
	}
}
