package com.ecommerce.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Reward;
import com.ecommerce.repository.RewardRepository;
import com.ecommerce.service.RewardService;
@Service
public class RewardServiceImpl implements RewardService{
	
	//inject Repository
	@Autowired
	private RewardRepository rewardRepository;
	
	

	@Override
	public Reward saveReward(Reward reward) {
	return rewardRepository.save(reward);
	}

	
	@Override
	public Reward getRewardById(Integer id) {
		Reward reward_1 = rewardRepository.findById(id);
		return reward_1;
	}
}
