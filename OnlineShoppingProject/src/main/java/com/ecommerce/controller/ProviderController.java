package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Provider;
import com.ecommerce.service.ProviderService;
@RestController
@RequestMapping("/provider")
public class ProviderController {
	
	@Autowired
	private ProviderService providerService;
	
	@PostMapping("/save")
	public ResponseEntity<Provider> saveProvider(@RequestBody Provider provider) {
		Provider pro =providerService.saveProvider(provider);
		return ResponseEntity.ok().body(pro);
		
	}
	

	@PutMapping("/update")
	public ResponseEntity<Provider> updateProvider(@RequestBody Provider provider , @PathVariable("id") Integer pid) {
		Provider pro =providerService.saveProvider(provider);
		return ResponseEntity.ok().body(pro);
		
	}
	

}
