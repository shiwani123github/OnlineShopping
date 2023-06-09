package com.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Reward;
import com.ecommerce.service.RewardService;

@RestController
@RequestMapping("/Reward")
public class RewardController {
	private static final Logger logger = LoggerFactory.getLogger(RewardController.class);
	@Autowired
	private RewardService rewardService;

	/*
	 * @Auther Balraj Naik
	 */
	@PostMapping("/saveReward")
	public Reward saveReward(@RequestBody Reward reward) {
		logger.info("in reward controller");
		Reward reward_1 = rewardService.saveReward(reward);
		return reward_1;
	}
	/*
	 * @Auther Vikas Koli
	 */

	@GetMapping("/reward/{id}")
	public ResponseEntity<Reward> getRewardById(@PathVariable("id") Integer id) {
		Reward reward_1 = rewardService.getRewardById(id);
		return ResponseEntity.ok().body(reward_1);

	}

	@DeleteMapping("/deleteReward/{id}")
	public ResponseEntity<String> deleteRewardById(@PathVariable("id") Integer id) {
		rewardService.deleteById(id);
		return ResponseEntity.ok().body("Reward get deleted");
	}
}
