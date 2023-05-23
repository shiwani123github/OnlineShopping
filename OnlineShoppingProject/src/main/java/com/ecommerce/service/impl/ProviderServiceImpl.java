package com.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Bill;
import com.ecommerce.model.Provider;
import com.ecommerce.repository.ProviderRepository;
import com.ecommerce.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {
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
		provider_1.setDescribes(provider_1.getDescribes());
		provider_1.setCreateDate(provider_1.getCreateDate());
		Provider provider_2 = providerRepository.save(provider_1);
		return provider_2;
	}

	@Override
	public Provider getProviderById(Integer id) {
		Provider provider = providerRepository.findById(id).get();
		return provider;
	}

	@Override
	public void deleteById(Integer id) {
		providerRepository.deleteById(id);

	}

	@Override
	public Provider updateBillByProviderId(Provider provider) {
		Integer providerId = provider.getPid();
		Provider providers = providerRepository.findById(providerId).get();
		providers.setProviderCode(provider.getProviderCode());
		providers.setProviderName(provider.getProviderName());
		providers.setPeople(provider.getPeople());
		providers.setPhone(provider.getPhone());
		provider.setAddress(provider.getAddress());
		provider.setFax(provider.getFax());
		providers.setDescribes(provider.getDescribes());
		providers.setCreateDate(provider.getCreateDate());
		List<Bill> bills = provider.getBillList();
		for (Bill bill : bills) {
			bill.setBillCode(bill.getBillCode());
			bill.setBillName(bill.getBillName());
			bill.setBillCom(bill.getBillCom());
			bill.setBillNum(bill.getBillNum());
			bill.setMoney(bill.getMoney());
			// billService.updateBill(bill);
		}
		return providerRepository.save(providers);
	}
}
