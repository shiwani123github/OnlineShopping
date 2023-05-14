package com.ecommerce.service;

import com.ecommerce.model.Reward;

public interface RewardService {
	
	public Reward saveReward(Reward reward);
	public Reward getRewardById(Integer id);

}
