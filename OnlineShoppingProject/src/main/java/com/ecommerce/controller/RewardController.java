package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.RewardService;

@RestController
public class RewardController {
	@Autowired
	private RewardService rewardService;


@DeleteMapping("/deleteReward/{id}")
public void deleteRewardById(@PathVariable("id") Integer id) {
	 rewardService.deleteById(id);
}
}