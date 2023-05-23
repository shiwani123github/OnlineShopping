package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Reward;
import com.ecommerce.repository.RewardRepository;
import com.ecommerce.service.RewardService;

@Service
public class RewardServiceImpl implements RewardService {
	@Autowired
	private RewardRepository rewardRepository;

	@Override
	public Reward saveReward(Reward reward) {
		return rewardRepository.save(reward);
	}

	@Override
	public Reward getRewardById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		rewardRepository.deleteById(id);
	}

}
