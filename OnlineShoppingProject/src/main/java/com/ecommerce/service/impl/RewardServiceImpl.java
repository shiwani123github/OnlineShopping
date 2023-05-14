package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.RewardRepository;
import com.ecommerce.service.RewardService;

@Service
    
    public class RewardServiceImpl implements RewardService {
	@Autowired
	private RewardRepository rewardRepository;

	@Override
	public void deleteById(Integer id) {
		
	}
}