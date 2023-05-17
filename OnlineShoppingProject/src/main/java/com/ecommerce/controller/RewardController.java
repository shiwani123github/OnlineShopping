package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Reward;
import com.ecommerce.service.RewardService;

@RestController
public class RewardController {
	@Autowired
	private RewardService rewardService;

	@PostMapping("/saveReward")

	public Reward saveReward(@RequestBody Reward reward) {
		Reward reward_1 = rewardService.saveReward(reward);
		return reward_1;
	}

	@GetMapping("/reward/{id}")
	public ResponseEntity<Reward> getRewardById(@PathVariable("id") Integer id) {
		Reward reward_1 = rewardService.getRewardById(id);
		return ResponseEntity.ok().body(reward_1);

	}

	@DeleteMapping("/deleteReward/{id}")
	public void deleteRewardById(@PathVariable("id") Integer id) {
		rewardService.deleteById(id);
	}
}
