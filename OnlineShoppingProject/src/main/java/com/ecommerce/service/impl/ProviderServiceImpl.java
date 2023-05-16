package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Provider;
import com.ecommerce.repository.ProviderRepository;
import com.ecommerce.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService{

	@Autowired
	private ProviderRepository providerRepository;
	
	@Override
	public Provider saveProvider(Provider provider) {
		return providerRepository.save(provider);
	
	}

	@Override
	public Provider updateProvider(Provider provider) {
		Integer id = provider.getPid();
		Provider provider_1 = providerRepository.findById(id).get();
		provider_1.setPid(provider_1.getPid());
		provider_1.setProviderCode(provider_1.getProviderCode());
		provider_1.setProviderName(provider_1.getProviderName());
		provider_1.setPeople(provider_1.getPeople());
		provider_1.setPhone(provider_1.getPhone());
		provider_1.setAddress(provider_1.getAddress());
		provider_1.setFax(provider_1.getFax());
		provider_1.setDescribe(provider_1.getDescribe());
		provider_1.setCreateDate(provider_1.getCreateDate());
		Provider provider_2 =providerRepository.save(provider_1);
		return provider_2;
		
	}

}
