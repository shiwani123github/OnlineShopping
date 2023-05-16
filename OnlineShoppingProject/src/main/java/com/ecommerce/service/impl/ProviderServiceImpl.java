package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Provider;
import com.ecommerce.repository.ProviderRepository;
import com.ecommerce.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {
	@Autowired
	private ProviderRepository providerRepository;

	@Override
	public Provider getProviderById(Integer id) {
		Provider pro = providerRepository.findById(id);
		return pro;
	}

	@Override
	public void deleteById(Integer id) {
		providerRepository.deleteById(id);

	}

}
