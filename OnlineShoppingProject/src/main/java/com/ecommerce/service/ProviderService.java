package com.ecommerce.service;

import com.ecommerce.model.Provider;

public interface ProviderService {
	public Provider saveProvider(Provider provider);

	public Provider updateProvider(Provider provider);

	public Provider getProviderById(Integer id);

	public void deleteById(Integer id);

}
